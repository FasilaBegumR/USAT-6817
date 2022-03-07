package com.Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.stepdefinition.JVMreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Edit.feature",glue={"com.stepdefinition"}, dryRun = false, monochrome = true,
plugin = {"pretty",
		
		"json:D:\\eclipse-workspace\\USAT-6816\\All Reports\\Json Reports\\jam.json"})




public class Run {
	
	@AfterClass
	public static void report() {
		JVMreport.generateJVMReports("D:\\eclipse-workspace\\USAT-6816\\All Reports\\Json Reports\\jam.json");
		
	}

}
