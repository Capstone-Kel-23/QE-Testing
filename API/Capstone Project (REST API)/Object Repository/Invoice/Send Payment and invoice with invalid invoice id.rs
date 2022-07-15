<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Send Payment and invoice with invalid invoice id</name>
   <tag></tag>
   <elementGuidId>03e7c0ee-5d3a-431b-a10d-b1653b3dcaf7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;id\&quot; : \&quot;23377654-c588-4ad8-ab87\&quot;;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>9f9b9351-a573-4b5d-8c51-f92c646862ca</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJFeHBpcmVzQXQiOjE2NTUzNjA3MjcsIlJvbGVzIjpbeyJpZCI6MiwibmFtZSI6IlJPTEVfVVNFUiJ9XSwiVXNlcklEIjoiNmI0M2EzMDgtNGE1Mi00MzY3LTllZTUtMjgzOTY1ZmU0Mzc2IiwiVmVyaWZpZWQiOnRydWV9.IfP6dNXar7-G5aDXyraQAeiDNgHyANQdq13LQyiowSY</value>
      <webElementGuid>f11b1f6b-13f8-4d93-a725-1467f5a85ea8</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://prodapi.tagihin.my.id/api/v1/invoice/send/23377654-c588-4ad8-ab87</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


assertThat(response.getStatusCode()).isIn(Arrays.asList(200, 201, 202))


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


assertThat(response.getResponseText()).contains('INV-0782667873217')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
