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

WebUI.navigateToUrl('https://simon.inder.gov.co/registro')

WebUI.click(findTestObject('Page_1545335332980/despliegue Tipo Persona'))

WebUI.click(findTestObject('Page_1545335332980/Tipo Persona'))

WebUI.click(findTestObject('Page_1545335332980/despliegue Tipo Documento'))

WebUI.click(findTestObject('Page_1545335332980/Tipo Documento'))

WebUI.click(findTestObject('Page_1545335332980/numero identificacin'))

WebUI.setText(findTestObject('Page_1545335332980/numero identificacin'), '1148697464')

WebUI.click(findTestObject('Page_1545335332980/nombre completo'))

WebUI.setText(findTestObject('Page_1545335332980/nombre completo'), 'Cristian Giovanny')

WebUI.click(findTestObject('Page_1545335332980/apellido completo'))

WebUI.setText(findTestObject('Page_1545335332980/apellido completo'), 'Martinez Valdez')

WebUI.click(findTestObject('Page_1545335332980/despliegue sexo'))

WebUI.click(findTestObject('Page_1545335332980/sexo'))

WebUI.clearText(findTestObject('Page_1545335332980/nacimiento'))

WebUI.setText(findTestObject('Page_1545335332980/nacimiento'), '03041994')

WebUI.click(findTestObject('Page_1545335332980/clave'))

WebUI.setText(findTestObject('Page_1545335332980/clave'), 'a++++++1')

WebUI.click(findTestObject('Page_1545335332980/confirm clave'))

WebUI.setText(findTestObject('Page_1545335332980/confirm clave'), 'a++++++1')

WebUI.click(findTestObject('Page_1545335332980/despliegue municipio'))

WebUI.click(findTestObject('Page_1545335332980/municipio'))

WebUI.click(findTestObject('Page_1545335332980/despliegue estrato'))

WebUI.click(findTestObject('Page_1545335332980/estrato'))

WebUI.click(findTestObject('Page_1545335332980/correo'))

WebUI.setText(findTestObject('Page_1545335332980/correo'), 'cmcris9@gmail.com')

WebUI.click(findTestObject('Page_1545335332980/telefono'))

WebUI.setText(findTestObject('Page_1545335332980/telefono'), '3234510037')

WebUI.check(findTestObject('Page_1545335332980/aceptar habeas'))

WebUI.check(findTestObject('Page_1545335332980/aceptar terminos'))

WebUI.click(findTestObject('Page_1545335332980/btn guardar'))

