package org.runner;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ResultClass {
	public static void main(String[] args) {
		Result runClasses = JUnitCore.runClasses(RunnerClass.class);
		if (runClasses.wasSuccessful()) {
			System.out.println("*******All classes executed Successfully*******");

			int ignoreCount = runClasses.getIgnoreCount();
			System.out.println("Ignore count : " + ignoreCount);

			int runCount = runClasses.getRunCount();
			System.out.println("RunCount : " + runCount);

			long runTime = runClasses.getRunTime();
			System.out.println("RunTime : " + runTime);
		} else {
			int failureCount = runClasses.getFailureCount();
			System.out.println("Failure Count : " + failureCount);

			List<Failure> failures = runClasses.getFailures();

			for (Failure failure : failures) {

				String message = failure.getMessage();
				System.out.println("Failure Message : " + message);

				Throwable exception = failure.getException();
				System.out.println("Exception : " + exception);
			}
		}

	}

}
