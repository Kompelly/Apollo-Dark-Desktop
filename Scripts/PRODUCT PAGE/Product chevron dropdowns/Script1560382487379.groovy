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

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Blue shirt product'))

WebUI.delay(2)

not_run: WebUI.executeJavaScript('var previewBar = document.getElementById("preview-bar-iframe"); previewBar.style.display = "none";', 
    [])

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Details chevron open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Details chevron close'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Type chevron open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Type chevron close'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Brand chevron open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Brand chevron close'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Shipping chevron open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Shipping chevron close'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/reviews chevron open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/reviews chevron close'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/reviews chevron open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/a_Write a review'))

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Product page/input_Name_reviewauthor'), 'suman')

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Product page/input_Email_reviewemail'), '`suman@gmail.com', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Stars review'))

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Product page/input_Review Title_reviewtitle'), 'Nice product')

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Product page/textarea_characters remaining_'), 'Good product')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/Submit review'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/number-2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/a_Next'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('APOLLO- Desktop/Product page/a_ Previous'), FailureHandling.CONTINUE_ON_FAILURE)

