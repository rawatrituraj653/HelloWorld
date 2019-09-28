package com.ut.test;

import java.sql.Connection;

import org.junit.Test;

import com.ut.beans.SingleConnectionProvider;

import junit.framework.TestCase;

public class TestSingleConnProvider extends TestCase {

	private SingleConnectionProvider conProvider = null;

	@Override
	protected void setUp() throws Exception {
		conProvider = new SingleConnectionProvider();
	}

	@Test(expected = NullPointerException.class)
	public void testGetConnection() {
		Connection con1 = conProvider.getConn();
		Connection con2 = conProvider.getConn();
		assertSame(con1, con2);
	}

	@Override
	protected void tearDown() throws Exception {
		conProvider = null;
	}

}
