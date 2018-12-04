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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

not_run: WebUI.click(findTestObject('join to school/login_btn'))

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://www.schooolz.com')

not_run: WebUI.delay(5)

not_run: WebUI.delay(3)

not_run: WebUI.setText(findTestObject('join to school/UserName_txt'), 'superadmin')

not_run: WebUI.delay(5)

not_run: WebUI.setText(findTestObject('join to school/UserPassword_txt'), '123456')

not_run: WebUI.delay(5)

WebUI.click(findTestObject('join to school/register_btn'))

WebUI.delay(5)

WebUI.click(findTestObject('add_jobs/jobs_btn'))

WebUI.delay(5)

WebUI.click(findTestObject('add_jobs/addjob_btn'))

WebUI.delay(5)

WebUI.setText(findTestObject('add_jobs/name'), RandomStringUtils.randomAlphabetic(5))

WebUI.delay(5)

WebUI.setText(findTestObject('add_jobs/Email'), RandomStringUtils.randomAlphabetic(5) + '@yahoo.com')

WebUI.setText(findTestObject('add_jobs/phone'), '01120354870')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('add_event/country'), '2', false)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('add_event/city'), '3', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('add_event/region'), '249', false)

WebUI.delay(5)

WebUI.setText(findTestObject('add_jobs/address'), 'helioplis')

WebUI.delay(5)

WebUI.setText(findTestObject('add_event/description'), 'mnc kjcan njNCLNL NLNLAN KNDKVN')

WebUI.delay(5)

WebUI.setText(findTestObject('add_event/content'), 'mnc kjcan njNCLNL NLNLAN KNDKVN')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('add_jobs/img'), 'C:\\Users\\M.Kamel\\git\\regression22\\Data Files\\1.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('add_jobs/save_btn'))

WebUI.verifyTextPresent('تم', false)

