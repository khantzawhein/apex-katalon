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

WebUI.navigateToUrl('http://localhost:3000/admin/login')

WebUI.setText(findTestObject('Object Repository/Page_Login - Apex/input_Login to Your Admin Account_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Apex/input_Login to Your Admin Account_password'), 
    '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login - Apex/input_Login to Your Admin Account_password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Apex/span_Admins'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Admins - Apex/h4_Admins'), 'Admins')

WebUI.click(findTestObject('Object Repository/Page_Admins - Apex/a_Customers'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Customers - Apex/h4_Customers'), 'Customers')

WebUI.click(findTestObject('Object Repository/Page_Customers - Apex/span_Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Product List - Apex/h4_Products'), 'Products')

WebUI.click(findTestObject('Object Repository/Page_Product List - Apex/a_Categories'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Categories - Apex/h4_Category'), 'Category')

WebUI.click(findTestObject('Object Repository/Page_Categories - Apex/a_Sales'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Sales - Apex/h4_Sales'), 'Sales')

WebUI.click(findTestObject('Object Repository/Page_Sales - Apex/a_Inquiries'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Inquiries - Apex/h4_Inquiries'), 'Inquiries')

WebUI.click(findTestObject('Object Repository/Page_Inquiries - Apex/a_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_Inquiries - Apex/button_OK'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Login - Apex/h1_Login to Your Admin Account'), 0)

WebUI.closeBrowser()

