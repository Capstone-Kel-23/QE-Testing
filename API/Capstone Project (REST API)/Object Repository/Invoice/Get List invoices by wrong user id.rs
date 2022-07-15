<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get List invoices by wrong user id</name>
   <tag></tag>
   <elementGuidId>9517ee16-a8e8-4744-b929-7cae102e5a25</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>06d626cf-99ce-4b87-9cd3-624c2578c824</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJFeHBpcmVzQXQiOjE2NTUzNjA3MjcsIlJvbGVzIjpbeyJpZCI6MiwibmFtZSI6IlJPTEVfVVNFUiJ9XSwiVXNlcklEIjoiNmI0M2EzMDgtNGE1Mi00MzY3LTllZTUtMjgzOTY1ZmU0Mzc2IiwiVmVyaWZpZWQiOnRydWV9.IfP6dNXar7-G5aDXyraQAeiDNgHyANQdq13LQyiowSY</value>
      <webElementGuid>5cc5be0d-44aa-4c70-9b55-b326c2197cb8</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://prodapi.tagihin.my.id/api/v1/invoices/user?userid=6b43a308-4a52-</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>GlobalVariable.user_id</defaultValue>
      <description></description>
      <id>547501e8-a46d-4848-93d3-dcb6d353c038</id>
      <masked>false</masked>
      <name>user_id</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)


assertThat(response.getResponseText()).contains([])</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
