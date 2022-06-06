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
        BrowserUtils.waitForPageToLoad(15);
        Assert.assertEquals(HomePageStepDefs.productTitle,productPage.getProductTitle());
    }

    @Then("select the product quantity {string}")
    public void select_the_product_quantity(String num) {
        productPage.selectTheQuantity(num);
    }


    @Then("add to shopping cart")
    public void add_to_shopping_cart() {
        productPage.addToCart();
    }

    @Then("go to cart page")
    public void goToCartPage() {
        productPage.goToShoppingCart();
    }
}
