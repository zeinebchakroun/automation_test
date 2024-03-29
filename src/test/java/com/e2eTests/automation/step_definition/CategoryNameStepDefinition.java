package com.e2eTests.automation.step_definition;

import com.e2eTests.automation.page_objects.CategoryNamePage;

import io.cucumber.java.en.When;

public class CategoryNameStepDefinition {
public CategoryNamePage categoryNamePage;
	
	public CategoryNameStepDefinition() {
		categoryNamePage  = new CategoryNamePage ();
	}
	
	@When("je clique sur categories")
	public void jeCliqueSurCategories() {
		CategoryNamePage.getCategories().click();
	    
	}
	@When("je saisis le nom de categorie {string}")
	public void jeSaisisLeNomDeCategorie(String categoryName) {
		CategoryNamePage.getCategoryName().sendKeys(categoryName);
	    
	}
	


}
