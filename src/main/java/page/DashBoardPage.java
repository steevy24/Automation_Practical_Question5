package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashBoardPage extends BasePage {

	WebDriver driver;
	
	String enteredName= "QA";

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"label-first\"]/b")
	WebElement DASHBOARD_HEADER_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TAGGLE_ALL_ELEMENT;

	@FindBy(how = How.XPATH, using = "/html/body/a[1]")
	WebElement REMOVE_FIRST_CUSTOMER_ELEMENT;

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_BUTTON_ELEMENT;
	
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]")
	WebElement ADD_CATEGORY_BOX_ELEMENT;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement ADD_CATEGORY_BUTTON_ELEMENT;
	
	
	
	
	
	
	


	public void verifyDashboardHeader() {

		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), "NSS-TODO List v 1.1", "Wrong Page");

	}

	public void clickToggleAllButton() {
		TAGGLE_ALL_ELEMENT.click();
	}

	public void clickRemoveCustomer() {
		REMOVE_FIRST_CUSTOMER_ELEMENT.click();
	}
	
	
	public void clickonRemoveButton() {
		REMOVE_BUTTON_ELEMENT.click();
	}

	
	public void addCategoryBox() {
		ADD_CATEGORY_BOX_ELEMENT.sendKeys("QA");
	}
	
	
	public void addCategoryButton() {
		ADD_CATEGORY_BUTTON_ELEMENT.click();
	}
	
	public void verifyCategorytEntered() {
		if (driver.getPageSource().contains("TECHFIOSQA2022A")) {
			
			System.out.println("Category present");
		}
		
		else {System.out.println("Category not present");}
		
	}
	
	public void verifyDuplicate() {
		if (driver.getPageSource().contains(enteredName)) {
			
			System.out.println("The category you want to add already exists:" + enteredName);
		}
		
	
}

}