package br.com.tt;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@formatter:off
@RunWith(Cucumber.class)
@CucumberOptions(format={"html:target/cucumber-html-report",
						 "json:target/cucumber-json-report"})

//@formatter:on
public class RunCukesTest {
	

}
