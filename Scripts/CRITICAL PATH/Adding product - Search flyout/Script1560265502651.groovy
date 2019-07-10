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

WebUI.callTestCase(findTestCase('CALL - URL'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Search input'))

WebUI.delay(1)

WebUI.setText(findTestObject('APOLLO- Desktop/Home page/Search input box to enter'), 'jacket')

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/2nd product - search flyout'))

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('APOLLO- Desktop/Product page/Color dropdown'), 'White', true)

WebUI.delay(1)

boolean a = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Product page/Add to bag'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('a=' + a)

if (a == true) {
    WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))
} else {
    WebUI.comment(' product sold out ')
}

WebUI.selectOptionByValue(findTestObject('APOLLO- Desktop/Product page/Color dropdown'), 'Black', true)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.delay(1)

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('APOLLO- Desktop/Customer Information page/Continue to shipping'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Shipping page/Radio button check'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Shipping page/Continue to payment'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

not_run: WebUI.click(findTestObject('APOLLO- Desktop/payment page/Payment section'))

