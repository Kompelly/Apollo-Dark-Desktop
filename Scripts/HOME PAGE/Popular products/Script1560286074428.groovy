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

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile - women slider'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/first product- women'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile - kids slider'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/first product- kids'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile - men slider'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/first product- men'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Popular products/Popular products tile'), 0)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Popular products/Previous button chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Previous button chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Previous button chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Popular products/Next button chevron'))

