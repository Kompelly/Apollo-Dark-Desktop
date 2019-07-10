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

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/First slick slide'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Shop Men button'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/second slick slide'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Shop Women button'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Third slick slide'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Shop womesn outer wear'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/First slick slide'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Next button chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Next button chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Previous button chevron'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/button_Next section'))

WebUI.delay(2)

WebUI.verifyTextPresent('Wool Sweater', false)

