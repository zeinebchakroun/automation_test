package com.e2eTests.automation.step_definition;


import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTests.automation.page_objects.CategoryNamePage;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryNameStepDefinition {
public CategoryNamePage categoryNamePage;
	
	public CategoryNameStepDefinition() {
		categoryNamePage  = new CategoryNamePage ();
		
	}
	public WebDriverWait wait;
	
	@When("je clique sur categories")
	public void jeCliqueSurCategories() {
		Setup.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		wait = new WebDriverWait(Setup.getDriver(),Duration.ofSeconds(30));
		
		CategoryNamePage.getCategories().click();
	    
	}
	@When("je saisis le nom de categorie {string}")
	public void jeSaisisLeNomDeCategorie(String categoryName) {
		CategoryNamePage.getCategoryName().sendKeys(categoryName);
	    
	}
	
	@Then("je clique sur le bouton de recherche")
	public void jeCliqueSurLeBoutonDeRecherche() {
		CategoryNamePage.getCategoryName().click(); 
	}




}
