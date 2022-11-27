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

WebUI.navigateToUrl('https://en-gb.facebook.com/reg/')

WebUI.setText(findTestObject('Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_8e27d1'), 
    'Sia')

WebUI.setText(findTestObject('Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_342d17'), 
    'Sapuluh')

WebUI.setText(findTestObject('Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_554ec3'), 
    'sapuluhsia@gmail.com')

WebUI.setText(findTestObject('Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_19fc6e'), 
    'sapuluhsia@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_7f0a99'), 
    'qkRVwq5lbuw=')

WebUI.selectOptionByValue(findTestObject('Page_Sign up for Facebook  Facebook/select_123456789101112131415161718192021222_566da4'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Page_Sign up for Facebook  Facebook/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Page_Sign up for Facebook  Facebook/select_202220212020201920182017201620152014_d959b4'), 
    '1991', true)

WebUI.click(findTestObject('Page_Sign up for Facebook  Facebook/label_Male'))

WebUI.click(findTestObject('Page_Sign up for Facebook  Facebook/button_Sign Up'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_id(katalon-rec_elementInfoDiv)'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/img_bridges_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_bridges_rc-imageselect-checkbox'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/img_bridges_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/span_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Resend confirmation code'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_To confirm your account, enter the 5-_578907'), '31633')

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_Next'))

