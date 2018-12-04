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

not_run: WebUI.openBrowser('')

not_run: WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.schooolz.com')

WebUI.delay(5)

not_run: WebUI.setText(findTestObject('home search/search_by_name'), 'إبتدائية يحيى بن وثاب لتحفيظ القرآن  الكريم')

WebUI.selectOptionByValue(findTestObject('home search/school_category'), '2', false)

WebUI.delay(5)

not_run: WebUI.selectOptionByValue(findTestObject('add_event/country'), '1', false)

not_run: WebUI.selectOptionByValue(findTestObject('add_event/city'), '2', false)

WebUI.click(findTestObject('home search/search_btn'))

WebUI.delay(10)

