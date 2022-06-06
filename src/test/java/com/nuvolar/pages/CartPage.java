package com.nuvolar.pages;

import com.nuvolar.utilities.BrowserUtils;
import com.nuvolar.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.stream.Collectors;

public class CartPage {
    public CartPage(){PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id = "sc-subtotal-label-buybox")
    private WebElement cartPageTotalQuantity;
    @FindAll({@FindBy(xpath = "(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[1]"),
                @FindBy(xpath = "(//span[@class='a-price']/span[@class='a-offscreen'])[1]")})
    private WebElement cartPageTotalPrice;
    @FindBy(xpath = "//div[@class='a-popover-wrapper']//li")
    private List<WebElement> cartPageQuantity;
    @FindAll({@FindBy(xpath = "(//div[@class='a-row sc-list-item sc-java-remote-feature']//span[@class='a-button-text a-declarative'])[2]"),
            @FindBy(xpath = "(//span[@class='a-button-text a-declarative'])[2]")})
    private WebElement cartPageQuantityBtn;
    @FindAll({@FindBy(css = ".a-size-medium.a-color-base.sc-price.sc-white-space-nowrap.sc-product-price.a-text-bold"),
            @FindBy(xpath = "//span[@class='a-price sc-product-price']/span[1]")})
    private List<WebElement> productPrice;
    @FindAll({@FindBy(xpath = "//div[@class='a-row sc-list-item sc-list-item-border sc-java-remote-feature']//span[@class='a-dropdown-prompt']"),
            @FindBy(xpath = "//div[@class='sc-item-content-group']//span[@class='a-dropdown-prompt']")})
    private List<WebElement> productQuantity;

    public String getCartPageTotalQuantity(){
        String quantity = cartPageTotalQuantity.getText().trim();
        int index = quantity.indexOf('(')+1;
        return quantity.substring(index,index+1);
    }

    public Double getTotalPrice(){
        return Double.valueOf(cartPageTotalPrice.getAttribute("innerText").trim().substring(1));
    }

    public Double getProductPrice(){
        List<Double> priceText = productPrice.stream().map(p->Double.valueOf(p.getAttribute("innerText").trim().substring(1))).collect(Collectors.toList());
        List<Double> quantityText = productQuantity.stream().map(p->Double.valueOf(p.getAttribute("innerText").trim())).collect(Collectors.toList());

        Double expectedPrice = BrowserUtils.getResult(priceText,quantityText);

        return expectedPrice;
    }

    public void setProductQuantity(String num){
        cartPageQuantityBtn.click();
        BrowserUtils.selectQuantity(cartPageQuantity,num);
    }
}
