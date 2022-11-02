package consultaGoogle
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import consultaTerminos.Terminos
import internal.GlobalVariable
import navegarGoogle.Google
import validarResultados.ResultsTasks

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class ConsultaGoogleSteps {
	@Given("I navigate to Google https:\\/\\/www.google.com")
	public void i_navigate_to_Google_https_www_google_com() {
		Google google = new Google()
		google.pageGoogle()
	}
	
	@When("I want to search for any terms")
	public void i_want_to_search_for_any_terms() {
	    
	}
	
	@Then("I should be able to search for a term Prueba using the single search bar")
	public void i_should_be_able_to_search_for_a_term_Prueba_using_the_single_search_bar() {
	    Terminos terms = new Terminos()
		terms.searchTerms(GlobalVariable.Term1)
	}
	
	@Then("I should be able to see how many results were found and how long the search took")
	public void i_should_be_able_to_see_how_many_results_were_found() {
	    ResultsTasks resulttask = new ResultsTasks()
		println(resulttask.validateResults())
		WebUI.closeBrowser()
	}
	
	@Then("I should be able to search for a term ---- using the single search bar")
	public void i_should_be_able_to_search_for_a_term_using_the_single_search_bar() {
		Terminos terms = new Terminos()
		terms.searchTerms(GlobalVariable.Term2)
	}
	
	@Then("The system should present an error message")
	public void the_system_should_present_an_error_message() {
		ResultsTasks resulttask = new ResultsTasks()
		println(resulttask.validateResults())
		WebUI.closeBrowser()
	}
}