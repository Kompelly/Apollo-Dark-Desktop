import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.setText(findTestObject('APOLLO- Desktop/Customer Information page/Email'), 'suman@gmail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Customer Information page/First name'), 'suman')

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Customer Information page/Last name'), 'kompelly')

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Customer Information page/Address'), '1435 st alxendre')

WebUI.setText(findTestObject('APOLLO- Desktop/Customer Information page/Apartment'), '220')

WebUI.setText(findTestObject('APOLLO- Desktop/Customer Information page/City'), 'montreal')

WebUI.selectOptionByValue(findTestObject('APOLLO- Desktop/Customer Information page/Country dropdown'), 'United States', 
    true)

WebUI.selectOptionByValue(findTestObject('APOLLO- Desktop/Customer Information page/states dropdown'), 'NJ', true)

WebUI.setText(findTestObject('APOLLO- Desktop/Customer Information page/ZIP code'), '07057')

