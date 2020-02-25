package Cucumber_Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(

		
		features = 
		
		//	{"CheapestPoplar.feature", "ExpensiveSaller.feature","WomenDresses.feature","Card.feature"}
		/*
		 * 
		 * { "src\\main\\java\\Features\\CheapestPoplar.feature",
		 * "src\\main\\java\\Features\\ExpensiveSaller.feature",
		 * "src\\main\\java\\Features\\WomenDresses.feature",
		 * "src\\main\\java\\Features\\Card.feature",
		 * 
		 * // "WomenDresses.feature","Card.feature"
		 * 
		 * } //
		 */					 		
		"src\\main\\java\\Features"
		
	//	"C:\\Users\\younisR\\eclipse-workspace\\Itsm\\src\\test\\java\\Feastures"
				,	glue={"StepDefinition"}
		)

public class Runner extends AbstractTestNGCucumberTests
{

	
	  
	  
	  

	
	
}

