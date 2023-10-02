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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe')

WebUI.setText(findTestObject('Object Repository/Page_W3Schools Tryit Editor/textarea'), 'hello world')

WebUI.click(findTestObject('Object Repository/Page_W3Schools Tryit Editor/div_Learn to Code                 With the worlds largest web developer site.                                                    Not Sure Where To Begin'))

WebUI.setText(findTestObject('Object Repository/Page_W3Schools Tryit Editor/input_Tutorials filter input_filter-tutoria_e71851'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_W3Schools Tryit Editor/input_Excercises filter input_filter-exerci_ee1ae2'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_W3Schools Tryit Editor/input_Filter field for certifications_filte_73e64a'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_W3Schools Tryit Editor/a_JAVASCRIPT'))

WebUI.click(findTestObject('Object Repository/Page_W3Schools Tryit Editor/a_CSS'))

WebUI.click(findTestObject('Object Repository/Page_W3Schools Tryit Editor/a__topnav-icons fa fa-menu w3-hide-large w3_c63883'))

WebUI.setText(findTestObject('Object Repository/Page_W3Schools Tryit Editor/input_Tutorials filter input_filter-tutoria_e71851'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_W3Schools Tryit Editor/input_Excercises filter input_filter-exerci_ee1ae2'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_W3Schools Tryit Editor/input_Filter field for certifications_filte_73e64a'), 
    '')

WebUI.closeBrowser()

