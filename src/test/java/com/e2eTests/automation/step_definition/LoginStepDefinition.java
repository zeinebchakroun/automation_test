package com.e2eTests.automation.step_definition;

import com.e2eTests.automation.page_objects.LoginPage;
import com.e2eTests.automation.utils.ConfigFileReader;
import com.e2eTests.automation.utils.SeleniumUtils;
import com.e2eTests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public LoginPage loginPage;
	public ConfigFileReader configFileReader;
	public SeleniumUtils seleniumUtils;
	
	public LoginStepDefinition () {
	loginPage = new LoginPage();
	configFileReader = new ConfigFileReader();
	seleniumUtils = new SeleniumUtils(); 
}

	@Given("je visite l'application NopCommerce")
	public void jeVisiteLApplicationNopCommerce() { 
		
		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}
	
	@When("je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) { 
		seleniumUtils.writeText(LoginPage.getEmail(), email);
	}
	
	@When("je saisis le login {string}")
	public void jeSaisisLeLogin(String login) {
		//LoginPage.getPassword().clear();
		//LoginPage.getPassword().sendKeys(login);
		seleniumUtils.writeText(LoginPage.getPassword(), login);
	}
	
	@When("je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() { 
		//LoginPage.getbtnLogin().click();
		seleniumUtils.click(LoginPage.getBtnLogin());
	}
	
	@Then("je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {  
	}

	@Then("je verifie le message d'erreur")
	public void jeVerifieLeMessageDErreur() {   
	}




}
