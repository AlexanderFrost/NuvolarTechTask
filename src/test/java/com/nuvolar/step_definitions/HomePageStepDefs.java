package com.nuvolar.step_definitions;

import com.nuvolar.pages.HomePage;
import com.nuvolar.utilities.BrowserUtils;
import com.nuvolar.utilities.ConfigurationReader;
import com.nuvolar.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

public class HomePageStepDefs {
        HomePage homePage = new HomePage();
        public static String productTitle;
    @Given("user on the home page")
    public void user_on_the_home_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user search {string}")
    public void user_search(String searchItem) {
        BrowserUtils.waitForPageToLoad(15);
        homePage.search(searchItem);
    }

    @Then("click the first product")
    public void click_the_first_product() {
        BrowserUtils.waitForPageToLoad(15);
        productTitle=homePage.firstProductOfList();
    }
}
