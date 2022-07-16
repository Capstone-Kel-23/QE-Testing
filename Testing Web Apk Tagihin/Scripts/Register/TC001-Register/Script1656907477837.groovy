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

WebUI.navigateToUrl('https://main--cool-empanada-e84275.netlify.app/')

WebUI.click(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/button_Daftar_v-btn v-btn--icon v-btn--roun_bc27d4'))

WebUI.click(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/input_Syarat  Ketentuan, Kebijakan Privasi _4f0e13'), 
    'Anggita')

WebUI.setText(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/input_Syarat  Ketentuan, Kebijakan Privasi _d9a892'), 
    'Anpifood2001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/input_Masukkan password minimal 8 karakter__e7b54d'), 
    'SSPrt73Z7T/CwLvb2YnTdg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/input_Konfirmasi Password tidak sesuai_input-178'), 
    'SSPrt73Z7T/CwLvb2YnTdg==')

WebUI.click(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/div_Syarat  Ketentuan, Kebijakan Privasi da_bc39c3'))

WebUI.click(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/button_DAFTAR (1)'))

WebUI.click(findTestObject('Object Repository/Register/TC1_Positif/Page_Tagihin/button_Masuk'))

WebUI.closeBrowser()

