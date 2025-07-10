package org.demo;

import java.io.IOException;

public class TestS extends RealTimeProject {

	public static void main(String[] args) throws IOException {

		RealTimeProject realTimeProject = new RealTimeProject();

		realTimeProject.getDriver("chrome");
		
		realTimeProject.LaunchUrl(realTimeProject.readExcel(1, 1));
	}
}
