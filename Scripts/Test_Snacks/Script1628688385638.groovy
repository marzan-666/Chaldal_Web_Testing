import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://chaldal.com/')

WebUI.click(findTestObject('Object Repository/Food/Snacks/Page_Chaldal  Online Grocery Shopping and D_1c8b72/a_Food'))

WebUI.click(findTestObject('Object Repository/Food/Snacks/Page_Chaldal  Online Grocery Shopping and D_1c8b72/div_FoodFood'))

WebUI.click(findTestObject('Object Repository/Food/Snacks/Page_Chaldal  Online Grocery Shopping and D_1c8b72/div_Food'))

WebUI.click(findTestObject('Object Repository/Food/Snacks/Page_Chaldal  Online Grocery Shopping and D_1c8b72/div_Snacks'))

WebUI.click(findTestObject('Object Repository/Food/Snacks/Page_Snacks - Chaldal Online Grocery Shoppi_d22e0d/div_Snacks'))

WebUI.click(findTestObject('Object Repository/Food/Snacks/Page_Snacks - Chaldal Online Grocery Shoppi_d22e0d/span_Snacks'))

WebUI.click(findTestObject('Object Repository/Food/Snacks/Page_Snacks - Chaldal Online Grocery Shoppi_d22e0d/div_Soups'))

WebUI.closeBrowser()

