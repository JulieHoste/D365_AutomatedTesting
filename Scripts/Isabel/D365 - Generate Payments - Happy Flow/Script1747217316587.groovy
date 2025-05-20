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

WebUI.enhancedClick(findTestObject('Page_Vendor payment journal -- Finance and _f966a9/svg_Rejected by__1ug3abe'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payment journal -- Finance and _f966a9/button_Lines'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_Generate payments_1'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/div_After the lookup is open, you can use A_1eee2c_1_2'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/input_Description_Sel_1036_0_1_input'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/div_After the lookup is open, you can use A_1eee2c_1_2_3'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/input_Name_AutoLookup_AccountID_1052_0_4_input'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_(AltEnter)        OK'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/span_Batch booking parameter_SysOperationTe_8095c8'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_(AltEnter)        OK_1'))

WebUI.delay(60)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_(ShiftF5)        Refresh'))

WebUI.delay(10)

attribute = WebUI.getAttribute(findTestObject('Page_Vendor payments -- Finance and Operations/input_Payment request id_LedgerJournalTrans_ac2578'), 
    'value')

WebUI.verifyMatch(attribute, 'Approved', true)

attribute1 = WebUI.getAttribute(findTestObject('Page_Vendor payments -- Finance and Operations/input_Payment request id_LedgerJournalTrans_df9748'), 
    'value')

WebUI.verifyMatch(attribute1, 'Approved', true)

WebUI.enhancedClick(findTestObject('Page_Vendor payments -- Finance and Operations/button_(Esc)        Back'))

