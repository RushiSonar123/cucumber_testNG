package Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
	@CucumberOptions(
			
			features= "C:\\Users\\CTSS\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\TestNG_Cucumber\\src\\test\\resources\\Login\\login.feature",
			glue ="Form"
			)
	
	public class Runner extends AbstractTestNGCucumberTests{  

}
