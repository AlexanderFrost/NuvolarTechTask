package com.nuvolar.step_definitions;

import com.nuvolar.pages.CartPage;
import com.nuvolar.pages.ProductPage;
import com.nuvolar.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ProductPageStepDefs {

    ProductPage productPage = new ProductPage();

    @And("verify the product page")
    public void verifyTheProductPage() {
        BrowserUtils.waitForClickablility(productPage.productTitle,10);
        Assert.assertEquals(HomePageStepDefs.productTitle,productPage.productTitle.getText().trim());
    }

    @Then("select the product quantity {string}")
    public void select_the_product_quantity(String num) {
        productPage.quantityBtn.click();
        BrowserUtils.selectQuantity(productPage.quantity,num);
    }


    @Then("add to shopping cart")
    public void add_to_shopping_cart() {
        productPage.addToCartBtn.click();
    }

    @Then("go to cart page")
    public void goToCartPage() {
        productPage.cartBtn.click();
    }
}
