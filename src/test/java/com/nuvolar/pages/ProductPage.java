package com.nuvolar.pages;

import com.nuvolar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage {
    public ProductPage(){PageFactory.initElements(Driver.get(),this);}


    @FindBy(id = "productTitle")
    public WebElement productTitle;

    @FindBy(id = "nav-cart-count")
    public WebElement cartBtn;

    @FindBy(xpath = "//div[@class='a-box-group']//span[@class='a-button-text a-declarative']")
    public WebElement quantityBtn;

    @FindBy(xpath = "//div[@class='a-popover a-dropdown a-dropdown-common a-declarative']//li")
    public List<WebElement> quantity;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartBtn;



}
