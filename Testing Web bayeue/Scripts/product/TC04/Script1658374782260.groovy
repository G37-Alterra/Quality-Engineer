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

WebUI.navigateToUrl('https://bayeue.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/Page_Login Page - Bayeue/input_Email_input-13'), 'admin@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login Page - Bayeue/input_Password_input-16'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login Page - Bayeue/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard Page - Bayeue/div_Products'))

WebUI.click(findTestObject('Object Repository/Page_Products Page - Bayeue/div_test pulsa_v-card v-card--link v-sheet _a1828c'))

WebUI.setText(findTestObject('Object Repository/Page_Create Category Page - Bayeue/input_Name_input-130'), 'testing katalon')

WebUI.click(findTestObject('Object Repository/Page_Create Category Page - Bayeue/button_Add'))

WebUI.closeBrowser()

