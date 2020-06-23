package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.TaskListPage;
/**
 * 
 * @author alok ranjan
 *
 */
public class CustomerTest extends BaseClass{
@Test
public void testCreateCustomer() throws IOException
{
	String CustomerName = f.getExcelValue("CreateCustomer", 1, 0);
	String CustomerDes = f.getExcelValue("CreateCustomer", 1, 1);
	HomePage h=new HomePage(driver);
	h.getTaskMenu().click();
	TaskListPage t=new TaskListPage(driver);      
	t.getAddNewBtn().click();
	t.getNewCustomerMenu().click();
	t.getEnterCustomerNameTBX().sendKeys(CustomerName);
	t.getEnterCustomerDescriptionTBX().sendKeys(CustomerDes);
	t.getSelectCustomerDropDown().click();
	t.getOurCompanyText().click();
	t.getCreateCustomerPopUpBtn().click();
	String ActualText = t.getVerifyCustomerNameCreated().getText();
	Assert.assertEquals(ActualText, CustomerName);
}
}
