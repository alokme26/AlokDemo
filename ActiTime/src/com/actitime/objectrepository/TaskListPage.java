package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TaskListPage {
@FindBy(xpath="//div[.='Add New']")
private WebElement AddNewBtn;
@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement NewCustomerMenu;
@FindBy (xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
private WebElement EnterCustomerNameTBX;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement EnterCustomerDescriptionTBX;
@FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
private WebElement SelectCustomerDropDown;
@FindBy(xpath="//div[@class='itemRow cpItemRow ' and .='Our company']")
private WebElement OurCompanyText;
@FindBy(xpath="//div[.='Create Customer']")
private WebElement CreateCustomerPopUpBtn;
@FindBy(xpath="//div[.='All Customers' and @title]")
private WebElement VerifyCustomerNameCreated;
public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewBtn() {
	return AddNewBtn;
}

public WebElement getNewCustomerMenu() {
	return NewCustomerMenu;
}

public WebElement getEnterCustomerNameTBX() {
	return EnterCustomerNameTBX;
}

public WebElement getEnterCustomerDescriptionTBX() {
	return EnterCustomerDescriptionTBX;
}

public WebElement getSelectCustomerDropDown() {
	return SelectCustomerDropDown;
}

public WebElement getOurCompanyText() {
	return OurCompanyText;
}

public WebElement getCreateCustomerPopUpBtn() {
	return CreateCustomerPopUpBtn;
}
	
	public WebElement getVerifyCustomerNameCreated() {
		return VerifyCustomerNameCreated;
}
}
