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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.util.KeywordUtil


WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/admin/login')

WebUI.setText(findTestObject('Object Repository/Page_Login - Apex/input_Login to Your Admin Account_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Apex/input_Login to Your Admin Account_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.click(findTestObject('Object Repository/Page_Login - Apex/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Apex/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_Product List - Apex/a_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Create Product - Apex/input_Product Name_product_name'), product_name)

WebUI.setText(findTestObject('Object Repository/Page_Create Product - Apex/div_Product Description_ql-editor'), product_description)

WebUI.setText(findTestObject('Object Repository/Page_Create Product - Apex/input_Product Price_product_price'), price)

WebUI.setText(findTestObject('Object Repository/Page_Create Product - Apex/input_Discount Price_discount_price'), promotional_price)

WebUI.click(findTestObject('Object Repository/Page_Create Product - Apex/input_Mark as featured product_is_featured_product'))

WebUI.click(findTestObject('Object Repository/Page_Create Product - Apex/input_Mark as new product_is_new_product'))

WebUI.click(findTestObject('Object Repository/Page_Create Product - Apex/button_Create'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement table = driver.findElement(By.xpath('//*[@id="right-container"]/main/div[2]/table/tbody'))

List<WebElement> rows = table.findElements(By.tagName('tr'))

WebElement matchedRow;

for (WebElement row : rows) {
    // Find the second cell (td) in the current row
    String nameText = row.findElement(By.xpath('.//td[1]')).getText().trim()
	
	if (nameText == product_name) {
		matchedRow = row
	}
}

if (!matchedRow) {
	assert false : "Product Not Found in Table"
} else {
	String priceText = matchedRow.findElement(By.xpath('.//td[2]')).getText().trim()
	
	WebUI.verifyEqual(priceText, price)
}

WebUI.closeBrowser()

