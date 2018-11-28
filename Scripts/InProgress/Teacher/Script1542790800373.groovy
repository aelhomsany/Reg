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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.schooolz.com/teacher/create')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/Name_txt'), 'eman mohamed')

WebUI.delay(3)

WebUI.setText(findTestObject('Reg as Teacher/Usernamee_txt'), 'student')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/Email_txt'), 'eman555@yahoo.com')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/Password_txt'), '123456789')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/ConfirmPassword_txt'), '123456789')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/Phone_txt'), '01022723522')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher/Country_Dropdown'), '1', false)

not_run: WebUI.verifyOptionSelectedByLabel(findTestObject('Reg as Teacher/Country_Dropdown'), '1', false, 60)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher/DropdownCity'), '1', false)

not_run: WebUI.verifyOptionPresentByValue(findTestObject('Reg as Teacher/DropdownCity'), '3', false, 60)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('Reg as Teacher/Region_Dropdown'), '1', FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyOptionSelectedByValue(findTestObject('Reg as Teacher/Region_Dropdown'), '1', false, 0)

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/Address_txt'), 'مصر الجديده')

WebUI.delay(5)

not_run: WebUI.acceptAlert()

WebUI.setText(findTestObject('Reg as Teacher/Dateofbirth_txt'), '1/1/1996')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/Id_txt'), '12345678978945')

WebUI.delay(0)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher/School_Dropdown'), '1', false)

not_run: WebUI.verifyOptionNotSelectedByLabel(findTestObject('Reg as Teacher/School_Dropdown'), '1', false, 0)

WebUI.delay(30)

WebUI.selectOptionByValue(findTestObject('Reg as Teacher/Level_Dropdown'), '1', false)

not_run: WebUI.verifyOptionNotSelectedByLabel(findTestObject('Reg as Teacher/Level_Dropdown'), '1', false, 0)

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/speciality'), 'كيمياء')

WebUI.delay(5)

WebUI.setText(findTestObject('Reg as Teacher/Messaage_txt'), 'lkjhgfdddddddddddddddddddddddddddddddddddddddddd')

WebUI.delay(5)

WebUI.uploadFile(findTestObject('Reg as Teacher/image_btn'), 'C:\\Users\\M.Kamel\\git\\regression2\\Data Files\\a.PNG')

