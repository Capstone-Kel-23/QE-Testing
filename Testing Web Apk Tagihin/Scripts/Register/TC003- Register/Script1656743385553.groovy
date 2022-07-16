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

WebUI.click(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/button_Daftar_v-btn v-btn--icon v-btn--roun_bc27d4'))

WebUI.click(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/input_Syarat  Ketentuan, Kebijakan Privasi _4f0e13'), 
    'Anggita')

WebUI.click(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/input_Syarat  Ketentuan, Kebijakan Privasi _d9a892'))

WebUI.setEncryptedText(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/input_Email tidak boleh kosong_input-173'), 
    'w8P5RB2NEvhxa2hVECcu/g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/input_Email tidak boleh kosong_input-178'), 
    'w8P5RB2NEvhxa2hVECcu/g==')

WebUI.click(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/div_Email tidak boleh kosong_v-input--selec_d5615c'))

WebUI.click(findTestObject('Object Repository/Register/TC3_Negatif/Page_Tagihin/button_DAFTAR (1)'))

