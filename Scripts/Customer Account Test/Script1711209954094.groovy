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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_Home  Apex Store/search_box_submit_btnn'))

WebUI.click(findTestObject('Object Repository/Page_Login - Apex/sign_up_btn'))

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_full_name'), full_name)

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_password'), password)

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_confirm_password'), password)

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_phone'), phone)

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_address'), address)

WebUI.click(findTestObject('Object Repository/Page_Sign Up - Apex/button_Sign Up'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Your Account  Apex Store/customer_email'), email)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Your Account  Apex Store/customer_phone'), phone)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Your Account  Apex Store/customer_address'), address)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Your Account  Apex Store/customer_name'), full_name)

WebUI.click(findTestObject('Object Repository/Page_Your Account  Apex Store/customer_logout_btn'))

WebUI.click(findTestObject('Page_Home  Apex Store/logged_in_message'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

