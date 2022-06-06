package com.nuvolar.step_definitions;

import com.nuvolar.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;

// In this class we define the before and after methods that runs for each step
// After method takes the screenshot for failedscenarios at the end of step
public class Hooks {

    @Before("@wip")
    public void setUp(){
        Driver.get().manage().window().maximize();

    }

    @After("@wip")
    public void tearDown(Scenario scenario){
    if(scenario.isFailed()){
        final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");
    }

        Driver.closeDriver();
    }
}
