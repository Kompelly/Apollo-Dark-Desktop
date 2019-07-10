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

//WebUI.click(findTestObject('APOLLO- Desktop/Home page/White variant'))
//WebUI.click(findTestObject('APOLLO- Desktop/Home page/Grey variant'))
boolean flag = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Home page/Navy variant'))

WebUI.comment('flag=' + flag)

if (flag == true) {
    WebUI.click(findTestObject('APOLLO- Desktop/Home page/Navy variant'))

    WebUI.delay(1)

    boolean a = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Product page/Add to bag'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('a=' + a)

    if (a == true) {
        WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))
    } else {
        WebUI.comment(' product sold out ')
    }
} else {
    WebUI.comment(' variant unavailable ')
}

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(1)

//
boolean flag1 = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Home page/Grey variant'))

WebUI.comment('flag1=' + flag1)

if (flag1 == true) {
    WebUI.click(findTestObject('APOLLO- Desktop/Home page/Grey variant'))

    WebUI.delay(1)

    boolean a1 = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Product page/Add to bag'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('a1=' + a1)

    if (a1 == true) {
        WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))
    } else {
        WebUI.comment(' product sold out ')
    }
} else {
    WebUI.comment(' variant unavailable ')
}

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(1)

//
boolean flag2 = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Home page/White variant'))

WebUI.comment('flag2=' + flag2)

if (flag2 == true) {
    WebUI.click(findTestObject('APOLLO- Desktop/Home page/White variant'))

    WebUI.delay(1)

    boolean a2 = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Product page/Add to bag'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('a2=' + a2)

    if (a2 == true) {
        WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))
    } else {
        WebUI.comment(' product sold out ')
    }
} else {
    WebUI.comment(' variant unavailable ')
}

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Cart collapse'))

WebUI.delay(1)

//
boolean flag3 = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Home page/Black variant'))

WebUI.comment('flag3=' + flag3)

if (flag3 == true) {
    WebUI.click(findTestObject('APOLLO- Desktop/Home page/Black variant'))

    WebUI.delay(1)

    boolean a3 = WebUI.verifyElementClickable(findTestObject('APOLLO- Desktop/Product page/Add to bag'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.comment('a3=' + a3)

    if (a3 == true) {
        WebUI.click(findTestObject('APOLLO- Desktop/Product page/Add to bag'))
    } else {
        WebUI.comment(' product sold out ')
    }
} else {
    WebUI.comment(' variant unavailable ')
}

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Home page/cart icon open'))

WebUI.delay(2)

WebUI.click(findTestObject('APOLLO- Desktop/Cart flyout/Checkout'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('CALL- CUSTOMER INFO PAGE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.callTestCase(findTestCase('CALL - SHIPPING TO PAYMENT'), [:], FailureHandling.STOP_ON_FAILURE)

