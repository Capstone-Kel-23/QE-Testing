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

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input_Lupa Password_input-17'), 
    'Anpimedia2001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input_Password tidak boleh kosong_input-21'), 
    'SSPrt73Z7T/CwLvb2YnTdg==')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/button_Login'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/a_Invoices'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/a_Add New'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-340'), 'Anggita')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-344'), 'buku ')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/div_Drop files here to upload Logo tidak bo_649b0d'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-360'), 'Anggita')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-364'), 'Aprilia200')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-368'), 'anggitaaprilia20001@gmail.com')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-372'), '09865776')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-377'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/div_JAMBI'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-383'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/div_KABUPATEN MERANGIN'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-389'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/div_MUARA SIAU'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-395'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/div_LUBUK BIRAH'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-401'), '56456456464')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/textarea__input-405'), 
    'jln desa1')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/div_Change Profile Picture'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-428'), '123')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input__input-442'), 'baju')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/textarea__input-445'), 
    'baju anak')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/input_Rp_input-452'), '35.000')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC1_Positif/Page_Tagihin/button_SAVE'))

WebUI.closeBrowser()

