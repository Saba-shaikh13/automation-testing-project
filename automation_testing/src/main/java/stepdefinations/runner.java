package stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber_features/demoblaze.feature",glue="stepdefinations" 
,tags="smoke",
monochrome=true,
plugin= {"pretty","html:target\\cucumberreport.html",
		"pretty","json:target\\cucumberreport.json"})
public class runner {

}
