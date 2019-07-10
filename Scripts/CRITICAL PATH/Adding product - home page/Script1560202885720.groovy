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

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/OUTER WEAR - TILES - Copy'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/OUTER WEAR - TILES'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Shop mens outer wear -button'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Lenin jacket'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('APOLLO- Desktop/Product page/Color dropdown'), 'Blue', true)

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('APOLLO- Desktop/Product page/Size dropdown'), 'MD', true)

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Increase qunatity - prod page'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Increase qunatity - prod page'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))

WebUI.delay(2)

WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.delay(1)

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('APOLLO- Desktop/Customer Information page/Continue to shipping'))

WebUI.click(findTestObject('APOLLO- Desktop/Shipping page/Radio button check'))

WebUI.click(findTestObject('APOLLO- Desktop/Shipping page/Continue to payment'))

WebUI.click(findTestObject('APOLLO- Desktop/payment page/Payment section'))

