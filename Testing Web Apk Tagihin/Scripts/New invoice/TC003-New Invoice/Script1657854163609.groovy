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

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input_Lupa Password_input-17'), 'Anpimedia2001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input_Password tidak boleh kosong_input-21'), 
    'SSPrt73Z7T/CwLvb2YnTdg==')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/button_Masuk'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/a_Invoices'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/a_Add New'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-332'), 'Pemana Jaya')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-336'), 'Referensi buku')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/p_Drop files here to upload'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-352'), 'Surya')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-356'), 'Permana')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-360'), 'Anggitaaprilia2001@gmail.com')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-364'), '0864834954534')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-369'), 'aceh')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/div_ACEH'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-369'), 'ACEH')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-375'), 'kabupaten simeulue')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/div_KABUPATEN SIMEULUE'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-381'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/div_TEUPAH SELATAN'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-387'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/div_LATIUNG'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-393'), '6565')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/textarea__input-397'), 'jln desa')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/p_Change Profile Picture'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-409'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/button_16'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/button_SAVE'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-415'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/button_29'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/button_SAVE'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-420'), '001')

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/div_Cash'))

WebUI.click(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/div_Online'))

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-436'), 'Baju')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/textarea__input-439'), 'musim panas')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input__input-442'), '2')

WebUI.setText(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/input_Rp_input-446'), '40.000')

WebUI.verifyElementNotClickable(findTestObject('Object Repository/New Invoice/Keseluruhan/TC3_Positif/Page_Tagihin/button_Mark Paid'))

WebUI.closeBrowser()

