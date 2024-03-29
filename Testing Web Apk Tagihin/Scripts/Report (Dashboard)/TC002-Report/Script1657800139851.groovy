import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://main--cool-empanada-e84275.netlify.app/dashboard/')

WebUI.click(findTestObject('Object Repository/Report/TC2_Positif/Page_Tagihin/div_Lupa Password_v-input__slot white'))

WebUI.setText(findTestObject('Object Repository/Report/TC2_Positif/Page_Tagihin/input_Email tidak valid_input-17'), 'Anpimedia2001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report/TC2_Positif/Page_Tagihin/input_Password tidak boleh kosong_input-21'), 
    'SSPrt73Z7T/CwLvb2YnTdg==')

WebUI.click(findTestObject('Object Repository/Report/TC2_Positif/Page_Tagihin/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Report/TC2_Positif/Page_Tagihin/a_Reports'))

WebUI.click(findTestObject('Object Repository/Report/TC2_Positif/Page_Tagihin/button_Unpaid'))

WebUI.closeBrowser()

