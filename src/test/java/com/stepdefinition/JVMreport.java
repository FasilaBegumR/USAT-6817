package com.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	public  static void generateJVMReports(String jsonpath) {
		
		File f = new File(System.getProperty("user.dir")+"\\All Reports\\JVM Reports");
		
		Configuration c = new Configuration(f, "USAT-6816");
		c.addClassifications("Domain", "Wittern");
		c.addClassifications("sprint", "Sprint18");
		c.addClassifications("Jira ticket", "USAT-6816");
		
		List<String> l= new ArrayList<String>();
		l.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
	}

}
