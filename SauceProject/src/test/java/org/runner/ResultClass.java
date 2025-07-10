package org.runner;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.textui.TestRunner;

public class ResultClass {

	public static void main(String[] args) {

		Result runClasses = JUnitCore.runClasses(RunnerClass.class);

		if (runClasses.wasSuccessful()) {

			System.out.println("*****ALL CLASSES EXECUTED SUCCESSFULLY*****");
			int ignoreCount = runClasses.getIgnoreCount();
			System.out.println("Ignore Count : " + ignoreCount);
			int runCount = runClasses.getRunCount();
			System.out.println("RunCount : " + runCount);
			long runTime = runClasses.getRunTime();
			System.out.println("RunTime : " + runTime);

		} else 
		{

			System.out.println("*****Failure Description******");

			int failureCount = runClasses.getFailureCount();
			System.out.println("Failure Count : " + failureCount);

			List<Failure> failures = runClasses.getFailures();

			for (Failure failure : failures) {

				String message = failure.getMessage();
				System.out.println("Failure message :" + message);

				Throwable exception = failure.getException();
				System.out.println("Exception : " + exception);
			}
		}
	}
}
