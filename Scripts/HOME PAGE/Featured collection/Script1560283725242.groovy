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

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Sophisticated and elegant - Tile'), 
    0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Sophisticated and elegant - Tile - hover'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/shop womens bottoms - button'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Designed for function - Tile'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Designed for function - Tile - hover'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/Shop menss jacket - button'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Sweaters - Tile'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Sweaters - Tile - hover'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/shop womens sweaters - button'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/Featured collection/Shirts - Tile'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/Featured collection/Shirts - Tile - hover'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Featured collection/Shop menss shirt - button'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/OUTER WEAR - TILES - Copy'), 0)

WebUI.delay(1)

WebUI.mouseOver(findTestObject('APOLLO- Desktop/Home page/OUTER WEAR - TILES'))

WebUI.delay(1)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Shop mens outer wear -button'))

WebUI.click(findTestObject('APOLLO- Desktop/Home page/Hero banner - CTA/Apollo icon'))

