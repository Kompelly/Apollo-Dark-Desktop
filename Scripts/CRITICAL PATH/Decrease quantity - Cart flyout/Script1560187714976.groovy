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

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Burgermenu'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Mens chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Mens - Top Chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Burger Menu/Shirts link'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Blue shirt product'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('APOLLO- Desktop/Product page/Size dropdown'), 'Medium', true)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Increase qunatity - prod page'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Increase qunatity - prod page'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Increase qunatity - prod page'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Increase qunatity - prod page'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Increase qunatity - prod page'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('APOLLO- Desktop/Cart flyout/Subtotal in cart flyout'))

WebUI.comment('a=' + a)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Decrease quantity - cart flyout'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Decrease quantity - cart flyout'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Decrease quantity - cart flyout'))

WebUI.delay(2)

String b = WebUI.getText(findTestObject('APOLLO- Desktop/Cart flyout/Subtotal in cart flyout'))

WebUI.comment('b=' + b)

WebUI.verifyNotEqual('a', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('CALL - SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

