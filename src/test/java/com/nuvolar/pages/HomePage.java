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
    private WebElement searchBar;

    @FindBy(id = "nav-search-submit-button")
    private WebElement searchBtn;

    @FindBy(xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
    private WebElement firstProductOfList;

    public void search(String searchText) {
        searchBar.sendKeys(searchText);
        searchBtn.click();
    }

    public String firstProductOfList() {
        String title = firstProductOfList.getText().trim();
        firstProductOfList.click();
        return title;
    }
}
