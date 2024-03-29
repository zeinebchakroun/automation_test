package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class ProductNamePage extends BasePage {

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement products;
	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement productName;
	@FindBy(how = How.ID, using = "search-products")
	private static WebElement btnSearch;
	
	public ProductNamePage() {
		super(Setup.getDriver());
	}
	public static WebElement getMenuCatalog() {
		return menuCatalog;
	}
	public static WebElement getProducts() {
		return products;
	}
	public static WebElement getProductName() {
		return productName;
	}
	public static WebElement getBtnSearch() {
		return btnSearch;
	}
}

