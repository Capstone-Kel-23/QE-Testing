<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Create Invoice with created invoice number</name>
   <tag></tag>
   <elementGuidId>399b2b33-96e6-4d0b-8769-ed96e6ce0239</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;additional_costs\&quot;: [\n    {\n      \&quot;name\&quot;: \&quot;pajak\&quot;,\n      \&quot;total\&quot;: 1000,\n      \&quot;type\&quot;: \&quot;tax\&quot;\n    },\n{\n      \&quot;name\&quot;: \&quot;discount\&quot;,\n      \&quot;total\&quot;: 500,\n      \&quot;type\&quot;: \&quot;disc\&quot;\n    }\n  ],\n  \&quot;client\&quot;: {\n    \&quot;address\&quot;: \&quot;kerumah\&quot;,\n    \&quot;city\&quot;: \&quot;tangerang\&quot;,\n    \&quot;country\&quot;: \&quot;IND\&quot;,\n    \&quot;email\&quot;: \&quot;audinacindy23@gmail.com\&quot;,\n    \&quot;first_name\&quot;: \&quot;test\&quot;,\n    \&quot;last_name\&quot;: \&quot;nama\&quot;,\n    \&quot;phone_number\&quot;: \&quot;086726172233\&quot;,\n    \&quot;postal_code\&quot;: \&quot;765622\&quot;,\n    \&quot;state\&quot;: \&quot;banten\&quot;\n  },\n  \&quot;date\&quot;: \&quot;2022-05-01\&quot;,\n  \&quot;date_due\&quot;: \&quot;2022-06-02\&quot;,\n  \&quot;description\&quot;: \&quot;Pembayaran barang barang\&quot;,\n  \&quot;invoice_number\&quot;: \&quot;INV-0782667873217\&quot;,\n  \&quot;items\&quot;: [\n    {\n      \&quot;description\&quot;: \&quot;minuman segar\&quot;,\n      \&quot;name\&quot;: \&quot;aqua\&quot;,\n      \&quot;price\&quot;: 1000,\n      \&quot;quantity\&quot;: 2\n    }\n  ],\n  \&quot;logo_url\&quot;: \&quot;www.google.com\&quot;,\n  \&quot;sub_total\&quot;: 2000,\n  \&quot;type_payment\&quot;: \&quot;online\&quot;,\n  \&quot;total\&quot;: 2500\n}&quot;,
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
      <webElementGuid>6c40f7eb-c224-46e3-883f-2d7e660abb5b</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJFeHBpcmVzQXQiOjE2NTUzNjA3MjcsIlJvbGVzIjpbeyJpZCI6MiwibmFtZSI6IlJPTEVfVVNFUiJ9XSwiVXNlcklEIjoiNmI0M2EzMDgtNGE1Mi00MzY3LTllZTUtMjgzOTY1ZmU0Mzc2IiwiVmVyaWZpZWQiOnRydWV9.IfP6dNXar7-G5aDXyraQAeiDNgHyANQdq13LQyiowSY</value>
      <webElementGuid>872124a2-3524-4cd4-8927-edc5afcf9af9</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://prodapi.tagihin.my.id/api/v1/invoice</restUrl>
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



WS.verifyResponseStatusCode(response, 400)

assertThat(response.getStatusCode()).isEqualTo(400)


assertThat(response.getResponseText()).contains('invoice number already exist')</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
