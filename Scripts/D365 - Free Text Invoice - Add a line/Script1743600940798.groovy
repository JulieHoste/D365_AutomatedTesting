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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('null'), GlobalVariable.Gebruikersnaam)

WebUI.waitForElementPresent(findTestObject('null'), 
    20)

WebUI.enhancedClick(findTestObject('null'))

WebUI.setText(findTestObject('null'), GlobalVariable.Wachtwoord)

WebUI.waitForElementPresent(findTestObject('null'), 
    20)

WebUI.enhancedClick(findTestObject('null'))

WebUI.navigateToUrl(GlobalVariable.HomeURL)

WebUI.enhancedClick(findTestObject('null'))

WebUI.enhancedClick(findTestObject('null'))

WebUI.enhancedClick(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/button_DVB  Dienst voor het Bloed'))

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_9ab458'), 
    'BEH')

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_concat(id(, , DataArea_id_16_1_0_inpu_66e95d'))

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/button_(AltN)        New'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_7e85a9'), 
    20)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_7e85a9'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_7e85a9'), 
    '000034458')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_ab86e4'))

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_ab86e4'), 
    '22/12/2024')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_b4d21e'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_b4d21e'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_b4d21e'), 
    '23/12/2024')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_Internally invoiced_CustInvoiceLine_L_14343b'))

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/svg_Internally invoiced__cwvim4'))

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_Internally invoiced_CustInvoiceLine_L_14343b'), 
    '7003020000')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_Internally invoiced_CustInvoiceLine_T_bd02ff'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_Internally invoiced_CustInvoiceLine_T_bd02ff'), 
    'DNO')

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_Internally invoiced_CustInvoiceLine_U_87a09a'))

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_Internally invoiced_CustInvoiceLine_U_87a09a'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/span_Financial dimensions line'))

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_8e151b'))

WebUI.setText(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/input_After the lookup is open, you can use_8e151b'), 
    '4533000')

WebUI.click(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/button_Post'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Free text invoice -- Finance and Operations/button_(AltEnter)        OK'))

