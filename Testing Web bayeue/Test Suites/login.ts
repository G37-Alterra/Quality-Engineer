<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>login</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>b0570893-5bf8-437e-afe8-191b7deb0a01</testSuiteGuid>
   <testCaseLink>
      <guid>efa0a3e3-b382-47c0-83f1-d9dfad4b5b14</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/login/TC01_valid login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>28338127-233b-497c-b3ce-c410813eefaf</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/login/TC02_invalid login</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>816b0523-7abc-415e-973c-e3f95cd21323</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/data login</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>816b0523-7abc-415e-973c-e3f95cd21323</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>ca1a3463-b0e4-4307-92f3-d109d9d67e10</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>816b0523-7abc-415e-973c-e3f95cd21323</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>be3418cc-47da-451b-9500-4191c211a991</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
