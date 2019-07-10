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

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Striped T-shirt'))

WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Image slider 1'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Image slider 2'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Image slider 3'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Image slider 4'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Image slider 5'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Image slider 7'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Image slider 8'))

not_run: WebUI.delay(2)

WebUI.delay(2)

not_run: WebUI.mouseOver(findTestObject('APOLLO- Desktop/Product page/Next button'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Product page/Previous button'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Previous button'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Next button'))
