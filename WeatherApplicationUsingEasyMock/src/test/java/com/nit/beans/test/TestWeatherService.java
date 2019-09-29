package com.nit.beans.test;

import org.easymock.EasyMock;
import org.junit.Test;

import com.nit.service.IBMWeatherForcator;
import com.nit.service.WeatherService;

import junit.framework.TestCase;

public class TestWeatherService extends TestCase {

	private WeatherService service;

	@Override
	protected void setUp() throws Exception {
		// creating WeatherForeCastorService obj
		service = new WeatherService();

		// Creating mock object for interface
		IBMWeatherForcator	ibmWeatherForeCastor=	     EasyMock.createMock(IBMWeatherForcator.class);

		// Setting dummy behaviour for WeatherForeCastor
		EasyMock.expect(ibmWeatherForeCastor.findTemperature(500081)).andReturn(42.14);
		EasyMock.expect(ibmWeatherForeCastor.findTemperature(500082)).andReturn(41.14);
		EasyMock.expect(ibmWeatherForeCastor.findTemperature(500031)).andReturn(35.14);
		EasyMock.replay(ibmWeatherForeCastor);

		// Injecting mock object to service class
		service.setIBMWeatherForeCastor(ibmWeatherForeCastor);
	}

	@Test
	public void testGetTemp() {
		//double actual = service.getTemperature(500081);
		double actual = service.getTemparature(500081);
		assertEquals(42.14, actual);
	}
	
	
 	@Override
	protected void tearDown() throws Exception {
		service = null;
	}

}
