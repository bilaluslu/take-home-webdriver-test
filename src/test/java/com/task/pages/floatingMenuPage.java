package com.task.pages;

import com.task.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class floatingMenuPage {

    public floatingMenuPage(){
        PageFactory.initElements(Driver.getDriver() ,this );
    }


    @FindBy(id = "menu")
    public WebElement floatingMenu;












}
