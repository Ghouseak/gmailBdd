package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"C:\\D\\Automation\\GmailBDD\\resources\\package2\\test3.feature"}
					,plugin= {"pretty","html:target"},
					monochrome=true)
public class GmailRunners {

}

