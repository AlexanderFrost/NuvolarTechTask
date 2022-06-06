package com.nuvolar.step_definitions;

import com.nuvolar.pages.CartPage;
import com.nuvolar.utilities.BrowserUtils;
import com.nuvolar.utilities.ConfigurationReader;
import com.nuvolar.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartPageStepDefs {
    CartPage cartPage = new CartPage();

    @And("verify total price and quantity {string}")
    public void verifyTotalPriceAndQuantity(String expectedQuantity) {
        BrowserUtils.waitFor(3);

        Assert.assertEquals(expectedQuantity,cartPage.getCartPageTotalQuantity());

        Assert.assertEquals(cartPage.getProductPrice(),cartPage.getTotalPrice());
    }

    @Then("change quantity of first product to {string}")
    public void changeQuantityOfFirstProductFromTo(String quantitySecond) {
        cartPage.setProductQuantity(quantitySecond);
    }
}
