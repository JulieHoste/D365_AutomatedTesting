import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Vendor payment journal -- Finance and _f966a9/svg_Rejected by__1ug3abe'), 10)

WebDriver driver = DriverFactory.getWebDriver()

//WebElement table = driver.findElements(By.xpath("//div[@id='GridOverview_3_0' and @class='dyn-container _1ntdzal dyn-grid dyn-gridEditable _gmxw7y']"))
'In Table'
//WebElement table = WebUI.findWebElement(findTestObject('Object Repository/Page_Vendor payment journal -- Finance and _f966a9/svg_Rejected by__1ug3abe', 20))

//.findTestObject('Object Repository/Page_Vendor payments -- Finance and Operations/svg_Rejected by__1ug3abe')
// Get all rows

List<WebElement> rows = driver.findElements(By.xpath('/html/body/div[2]/div/div[6]/div/form/div[5]/div/div[2]/div[2]/div[2]/div[3]/div/div/div/div/div/div[1]/div[3]/div[1]'))
//List<WebElement> rows = table.findElements(By.xpath('//div[@class=\'fixedDataTableRowLayout_rowWrapper\''))

println('Nbr of rows: ' + rows.size())

int rowsCount = rows.size()

'Find a matching text in a table and performing action'

'Loop will execute for all the rows of the table'
for (int i = 0; i < rows.size(); i++) {
    String row = rows.get(i).click() //WebElement element = driver.findElement(By.xpath('//div[@class="fixedDataTableRowLayout_rowWrapper").get(i))
    //element.click();
}

