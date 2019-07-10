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

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Featured'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Best selling'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Alphabetically A-Z'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Alphabetically Z-A'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Price-Low to high'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/price-High to low'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Date - old to new'))

WebUI.delay(3)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Date- new to old'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/sort/Filter dropdown'))

WebUI.takeScreenshot()

WebUI.delay(2)

