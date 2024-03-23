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

WebUI.click(findTestObject('Object Repository/Page_Home  Apex Store/i_Contact us_fa-solid fa-user fa-lg'))

WebUI.click(findTestObject('Object Repository/Page_Login - Apex/a_Sign Up (Its free)'))

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_full_name'), 'Khant Zaw Hein')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_email'), 'kzh1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_confirm_password'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_phone'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_Sign Up - Apex/input_Sign Up Account_address'), 'Chiang Mai')

WebUI.click(findTestObject('Object Repository/Page_Sign Up - Apex/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Your Account  Apex Store/p_kzh1gmail.com'))

WebUI.click(findTestObject('Object Repository/Page_Your Account  Apex Store/p_12345678'))

WebUI.click(findTestObject('Object Repository/Page_Your Account  Apex Store/p_Chiang Mai'))

WebUI.click(findTestObject('Object Repository/Page_Your Account  Apex Store/h5_Khant Zaw Hein'))

WebUI.click(findTestObject('Object Repository/Page_Your Account  Apex Store/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Home  Apex Store/div_Logged Out Successfully'))

WebUI.closeBrowser()

