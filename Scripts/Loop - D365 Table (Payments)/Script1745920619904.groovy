import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.chrome.ChromeDriver;
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.windows.keyword.builtin.FindElementsKeyword

import groovy.console.ui.BytecodeCollector

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable


'In Table - Get all rows'

List<WebElement> rows = WebUI.findWebElements(findTestObject('Object Repository/Page_Vendor payment journal -- Finance and _f966a9/div_Rejected by_fixedDataTableCellLayout_wr_30f063_1'), 10)
int rowsCount = rows.size()
println('Nbr of Journals: ' + rowsCount.toString())


'Loop will execute for all the rows of the table'
for (WebElement element : rows) 
	{
		// ISSUE TO CLICK / FIND THE SECOND ROW
		element.click()
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payment journal -- Finance and _f966a9/button_Lines'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_Generate payments_1'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/div_After the lookup is open, you can use A_1eee2c_1_2'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/input_Description_Sel_1036_0_1_input'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/div_After the lookup is open, you can use A_1eee2c_1_2_3'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/input_Name_AutoLookup_AccountID_1052_0_4_input'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_(AltEnter)        OK_1'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/span_Batch booking parameter_SysOperationTe_8095c8'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_(AltEnter)        OK_1_2'))
		
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_(AltS)        Save'))
		
		WebUI.waitForPageLoad(60)
		
		// ISSUE TO COUNT THE PAYMENT LINES  , nr is equal to 0
		List<WebElement> rowsPaymentlines = WebUI.findWebElements(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/div_DateVoucherCompanyAccountVendor nameFin_31ebec_1'), 10)
		int rowsCountpayments = rowsPaymentlines.size()
		println('Nbr of PaymentsLines: ' + rowsCountpayments.toString())
		
		for (WebElement elementPayment : rowsPaymentlines)
			{				
				String paymentStatus = WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/id_LedgerJournalTrans_f27213', ['number': elementPayment]),
				'', 'Sent', 0)		
				println('Paymentline: ' + elementPayment.toString() + '. Status: ' + paymentStatus)
			}
			
		WebUI.enhancedClick(findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/button_(Esc)        Back'))
	
}

