package CaseStudy2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="FeatureFile", glue= { "CaseStudy1" } ) 

public class Runner_class 
{

}
