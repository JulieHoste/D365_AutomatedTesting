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

WebUI.callTestCase(findTestCase('Isabel/D365 - Log In'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Dashboard -- Finance and Operations/div_Sign out_modulesPaneOpener'), 
    10)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Dashboard -- Finance and Operations/div_Sign out_modulesPaneOpener'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Dashboard -- Finance and Operations/div_Modules'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Dashboard -- Finance and Operations/a_Accounts payable'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard -- Finance and Operations/button_Collapse all'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Dashboard -- Finance and Operations/a_Vendor payment journal'))

WebUI.waitForPageLoad(5)

WebUI.callTestCase(findTestCase('Isabel/D365 - Generate Payments - Happy Flow'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Isabel/D365 - Generate Payments - Unhappy Flow'), [:], FailureHandling.STOP_ON_FAILURE)

