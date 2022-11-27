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

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_8e27d1'), 
    'Elyta')

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_342d17'), 
    'Siregar')

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_554ec3'), 
    'elytajs9@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/input_concat(We couldn, , t create your acc_19fc6e'), 
    'elytajs9@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/select_123456789101112131415161718192021222_566da4'), 
    '25', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/select_JanFebMarAprMayJunJulAugSepOctNovDec'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/select_202220212020201920182017201620152014_d959b4'), 
    '2008', true)

WebUI.click(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/input_Male_sex'))

WebUI.click(findTestObject('Object Repository/Page_Sign up for Facebook  Facebook/button_Sign Up'))

