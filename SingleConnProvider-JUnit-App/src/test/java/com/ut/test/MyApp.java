package com.ut.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyApp {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSingleConnProvider.class);
		int totalCases = result.getRunCount();
		System.out.println("Total Runs : " + totalCases);
		int failureCnt = result.getFailureCount();
		System.out.println("Failure Count : " + failureCnt);
		System.out.println("Below are the reasons for failure : ");
		if (failureCnt > 0) {
			List<Failure> failures = result.getFailures();
			for (Failure f : failures) {
				System.out.println(f.getMessage());
			}
		}
	}
}
