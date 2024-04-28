package com.e2eTests.automation.page_objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class CategoryNamePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement categories;

	@FindBy(how = How.ID, using = "SearchCategoryName")
	private static WebElement categoryName;

	@FindBy(how = How.ID, using = "search-categories")
	private static WebElement butnSearch;

	
	public CategoryNamePage() {
		super(Setup.getDriver());
	}

	public static WebElement getCategories() {
		return categories;
	}

	public static WebElement getCategoryName() {
		return categoryName;
	}

	public static WebElement getButnSearch() {
		return butnSearch;
	}
	
}
