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

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payment journal -- Finance and _f966a9/input_Rejected by_LedgerJournalTable_Journa_58aaa8'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payment journal -- Finance and _f966a9/button_Lines'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_Generate payments'))

WebUI.enhancedClick(findTestObject('Page_Vendor payments -- Finance and Operations/button_(AltEnter)        OK_1_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/span_Batch booking parameter_SysOperationTe_2ffc7a'))

WebUI.enhancedClick(findTestObject('Page_Vendor payments -- Finance and Operations/button_(AltEnter)        OK_1_2 - Copy'))

WebUI.delay(60)

WebUI.enhancedClick(findTestObject('Page_Vendor payments -- Finance and Operations/button_(ShiftF5)        Refresh - Copy'))

WebUI.delay(10)

attributeUnhappy = WebUI.getAttribute(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/input_Payment request id_LedgerJournalTrans_649733'), 
    'value')

WebUI.verifyMatch(attributeUnhappy, 'Rejected', true)

attribute1Unhappy = WebUI.getAttribute(findTestObject('Page_Vendor payments -- Finance and Operations/input_Payment request id_LedgerJournalTrans_f27213'), 
    'value')

WebUI.verifyMatch(attribute1Unhappy, 'Rejected', true)

