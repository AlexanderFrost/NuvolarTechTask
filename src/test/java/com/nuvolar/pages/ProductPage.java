package com.nuvolar.pages;

import com.nuvolar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage {
    public ProductPage(){PageFactory.initElements(Driver.get(),this);}


    @FindBy(id = "productTitle")
    private WebElement productTitle;

    @FindBy(id = "nav-cart-count")
    private WebElement cartBtn;

    @FindBy(xpath = "//div[@class='a-box-group']//span[@class='a-button-text a-declarative']")
    private WebElement quantityBtn;

    @FindBy(xpath = "//div[@class='a-popover a-dropdown a-dropdown-common a-declarative']//li")
    private List<WebElement> quantity;

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;


    public String getProductTitle() {
        return productTitle.getText().trim();
    }

    public void addToCart() {
        addToCartBtn.click();
    }

    public void goToShoppingCart() {
        cartBtn.click();
    }

    public void selectTheQuantity(String num) {
        quantityBtn.click();
        for (WebElement e:quantity) {
            if (e.getText().trim().equals(num)){
                e.click();
                break;
            }
        }
    }
}
