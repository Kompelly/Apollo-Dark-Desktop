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

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Small'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Red'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a=' + a)

int b = 0

WebUI.verifyNotEqual('a', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Green'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a1 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a1=' + a1)

WebUI.verifyNotEqual('a1', 'b')

WebUI.delay(2)

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Blue'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a2 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a2=' + a2)

WebUI.verifyNotEqual('a2', 'b')

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Purple'))

WebUI.delay(2)

WebUI.delay(2)

String a3 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a3=' + a3)

WebUI.verifyNotEqual('a3', 'b')

WebUI.delay(2)

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Medium'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Red'))

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a4 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.comment('a4=' + a4)

WebUI.verifyNotEqual('a4', 'b')

WebUI.delay(4)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Green'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a5 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a5=' + a5)

WebUI.verifyNotEqual('a5', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Blue'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a6 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.comment('a6=' + a6)

WebUI.verifyNotEqual('a6', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Purple'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a7 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a7=' + a7)

WebUI.verifyNotEqual('a7', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Large'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Filter dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Red'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a8 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a8=' + a8)

WebUI.verifyNotEqual('a8', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Green'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a9 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a9=' + a9)

WebUI.verifyNotEqual('a9', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Blue'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a10 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.comment('a10=' + a10)

WebUI.verifyNotEqual('a10', 'b')

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Purple'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

String a11 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a11=' + a11)

WebUI.verifyNotEqual('a11', 'b')

WebUI.delay(2)

not_run: WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/Color dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Collection page/Filter/a_Clear all filters'))

WebUI.delay(2)

String a12 = WebUI.getText(findTestObject('APOLLO- Desktop/Collection page/Filter/Filtered count'))

WebUI.delay(2)

WebUI.comment('a12=' + a12)

WebUI.verifyNotEqual('a12', 'b')

