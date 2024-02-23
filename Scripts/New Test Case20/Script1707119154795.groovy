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

WebUI.navigateToUrl('https://www.intel.com/content/www/us/en/homepage.html')

WebUI.click(findTestObject('Object Repository/Page_Intel  Data Center Solutions, IoT, and_dfcb37/button_Products'))

WebUI.click(findTestObject('Object Repository/Page_Intel  Data Center Solutions, IoT, and_dfcb37/a_Software'))

WebUI.click(findTestObject('Object Repository/Page_Intel Software/h2_AI'))

WebUI.click(findTestObject('Object Repository/Page_AI Suite/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_AI Suite/a_Industry Solutions'))

WebUI.click(findTestObject('Object Repository/Page_AI Suite/a_Success Stories'))

WebUI.click(findTestObject('Object Repository/Page_AI Suite/a_News  Ideas'))

WebUI.click(findTestObject('Object Repository/Page_AI Suite/a_Resources'))

