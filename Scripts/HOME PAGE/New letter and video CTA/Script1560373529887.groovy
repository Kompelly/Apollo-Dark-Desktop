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

WebUI.scrollToElement(findTestObject('APOLLO- Desktop/Home page/News letter and CTA/Subscribe to our newsletter'), 0)

WebUI.delay(2)

WebUI.setText(findTestObject('APOLLO- Desktop/Home page/News letter and CTA/input_Subscribe to our newsletter'), 'suman@gmail.com')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/News letter and CTA/button Sign Up'))

WebUI.delay(2)

not_run: String a = WebUI.getText(findTestObject('APOLLO- Desktop/Home page/News letter and CTA/p_Thanks for signing up for ou'))

not_run: WebUI.comment('a=' + a)

not_run: WebUI.delay(2)

not_run: String b = 'Thanks for signing up for our newsletter '

not_run: if (a == b) {
    WebUI.comment('new letter signed up')
} else {
    not_run: WebUI.comment(' news letter not signed up')
}

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/News letter and CTA/start shopping'))

