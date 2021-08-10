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

WebUI.click(findTestObject('Object Repository/Pet Care/Dog Food/Page_Chaldal  Online Grocery Shopping and D_1c8b72/a_Pet Care'))

WebUI.click(findTestObject('Object Repository/Pet Care/Dog Food/Page_Pet Care - Chaldal Online Grocery Shop_884945/span_Pet Care'))

WebUI.click(findTestObject('Object Repository/Pet Care/Dog Food/Page_Pet Care - Chaldal Online Grocery Shop_884945/a_Dog Food'))

WebUI.click(findTestObject('Object Repository/Pet Care/Dog Food/Page_Dog Food - Chaldal Online Grocery Shop_ae0807/div_Pet CareDog FoodDog Food'))

WebUI.click(findTestObject('Object Repository/Pet Care/Dog Food/Page_Dog Food - Chaldal Online Grocery Shop_ae0807/span_Dog Food'))

WebUI.click(findTestObject('Object Repository/Pet Care/Dog Food/Page_Dog Food - Chaldal Online Grocery Shop_ae0807/div_Dog Food'))

WebUI.closeBrowser()

