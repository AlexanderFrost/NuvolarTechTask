package com.nuvolar.pages;

import com.nuvolar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
/*This page contains
* Locaters of Web Elements
* methods for relevant actions
* */
public class HomePage {

    public HomePage(){PageFactory.initElements(Driver.get(), this);}

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchBtn;

    @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
    public WebElement firstProductOfList;

    @FindBy(id = "nav-cart-count")
    public WebElement cartCount;
}
