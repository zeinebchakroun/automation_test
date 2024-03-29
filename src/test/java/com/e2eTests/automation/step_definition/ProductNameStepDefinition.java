package com.e2eTests.automation.step_definition;

import com.e2eTests.automation.page_objects.ProductNamePage;

import io.cucumber.java.en.When;

public class ProductNameStepDefinition {

	public ProductNamePage productNamePage;
	
	public ProductNameStepDefinition() {
		productNamePage  = new ProductNamePage ();
	}
	
	@When("je clique sur Catalog")
	public void jeCliqueSurCatalog() {
		ProductNamePage.getMenuCatalog().click();
	}
	@When("je clique sur products")
	public void jeCliqueSurProducts() { 
		ProductNamePage.getProducts().click();
	}
	@When("je saisis le nom du produit {string}")
	public void jeSaisisLeNomDuProduit(String productName) {  
		ProductNamePage.getProductName().sendKeys(productName);
	}
	@When("je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		ProductNamePage.getBtnSearch().click();
	}



}
