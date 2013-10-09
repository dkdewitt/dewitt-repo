<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE abiword PUBLIC "-//ABISOURCE//DTD AWML 1.0 Strict//EN" "http://www.abisource.com/awml.dtd">
<abiword template="false" xmlns:ct="http://www.abisource.com/changetracking.dtd" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:math="http://www.w3.org/1998/Math/MathML" xid-max="129" xmlns:dc="http://purl.org/dc/elements/1.1/" fileformat="1.1" xmlns:svg="http://www.w3.org/2000/svg" xmlns:awml="http://www.abisource.com/awml.dtd" xmlns="http://www.abisource.com/awml.dtd" xmlns:xlink="http://www.w3.org/1999/xlink" version="2.9.2" xml:space="preserve" props="dom-dir:ltr; document-footnote-restart-section:0; document-endnote-type:numeric; document-endnote-place-enddoc:1; document-endnote-initial:1; lang:en-US; document-endnote-restart-section:0; document-footnote-restart-page:0; document-footnote-type:numeric; document-footnote-initial:1; document-endnote-place-endsection:0">
<!-- ======================================================================== -->
<!-- This file is an AbiWord document.                                        -->
<!-- AbiWord is a free, Open Source word processor.                           -->
<!-- More information about AbiWord is available at http://www.abisource.com/ -->
<!-- You should not edit this file by hand.                                   -->
<!-- ======================================================================== -->

<metadata>
<m key="abiword.generator">AbiWord</m>
<m key="dc.format">application/x-abiword</m>
</metadata>
<rdf>
</rdf>
<history version="1" edit-time="144412" last-saved="1381237198" uid="4ced9468-2ec9-11e3-930f-cd6c0bdf0c0b">
<version id="1" started="1381237198" uid="895b77fc-3019-11e3-930f-cd6c0bdf0c0b" auto="0" top-xid="129"/>
</history>
<styles>
<s type="P" name="Normal" basedon="" followedby="Current Settings" props="font-family:Liberation Serif; margin-top:0pt; font-variant:normal; margin-left:0pt; text-indent:0in; widows:2; font-style:normal; font-weight:normal; text-decoration:none; color:000000; line-height:1.0; text-align:left; margin-bottom:0pt; text-position:normal; margin-right:0pt; bgcolor:transparent; font-size:12pt; font-stretch:normal"/>
</styles>
<pagesize pagetype="A4" orientation="portrait" width="210.000000" height="297.000000" units="mm" page-scale="1.000000"/>
<section xid="1">
<p style="Normal" xid="2" props="text-align:left; dom-dir:ltr">stuffsystem: Example Using Multiple Java EE 6 Technologies Deployed as an EAR</p>
<p style="Normal" xid="3">==============================================================================================</p>
<p style="Normal" xid="4" props="text-align:left; dom-dir:ltr">Author: Pete Muir</p>
<p style="Normal" xid="5" props="text-align:left; dom-dir:ltr">Level: Intermediate</p>
<p style="Normal" xid="6" props="text-align:left; dom-dir:ltr">Technologies: EAR</p>
<p style="Normal" xid="7" props="text-align:left; dom-dir:ltr">Summary: Based on kitchensink, but deployed as an EAR</p>
<p style="Normal" xid="8" props="text-align:left; dom-dir:ltr">Target Product: EAP</p>
<p style="Normal" xid="9" props="text-align:left; dom-dir:ltr">Source: &lt;https://github.com/jboss-jdf/jboss-as-quickstart/&gt;</p>
<p style="Normal" xid="10"><c></c></p>
<p style="Normal" xid="11" props="text-align:left; dom-dir:ltr">What is it?</p>
<p style="Normal" xid="12">-----------</p>
<p style="Normal" xid="13"><c></c></p>
<p style="Normal" xid="14" props="text-align:left; dom-dir:ltr">This is your project! It is a sample, deployable Maven 3 project to help you get your foot in the door developing with Java EE 6 on JBoss Enterprise Application Platform 6 or JBoss AS 7. </p>
<p style="Normal" xid="15"><c></c></p>
<p style="Normal" xid="16" props="text-align:left; dom-dir:ltr">This project is setup to allow you to create a compliant Java EE 6 application using JSF 2.0, CDI 1.0, EJB 3.1, JPA 2.0 and Bean Validation 1.0. It includes a persistence unit and some sample persistence and transaction code to introduce you to database access in enterprise Java. </p>
<p style="Normal" xid="17"><c></c></p>
<p style="Normal" xid="18" props="text-align:left; dom-dir:ltr">System requirements</p>
<p style="Normal" xid="19">-------------------</p>
<p style="Normal" xid="20"><c></c></p>
<p style="Normal" xid="21" props="text-align:left; dom-dir:ltr">All you need to build this project is Java 7.0 (Java SDK 1.7) or better, Maven 3.0 or better.</p>
<p style="Normal" xid="22"><c></c></p>
<p style="Normal" xid="23" props="text-align:left; dom-dir:ltr">The application this project produces is designed to be run on JBoss Enterprise Application Platform 6 or JBoss AS 7. </p>
<p style="Normal" xid="24"><c></c></p>
<p style="Normal" xid="25"> </p>
<p style="Normal" xid="26" props="text-align:left; dom-dir:ltr">Configure Maven</p>
<p style="Normal" xid="27">---------------</p>
<p style="Normal" xid="28"><c></c></p>
<p style="Normal" xid="29" props="text-align:left; dom-dir:ltr">If you have not yet done so, you must [Configure Maven](../README.md#configure-maven) before testing the quickstarts.</p>
<p style="Normal" xid="30"><c></c></p>
<p style="Normal" xid="31"><c></c></p>
<p style="Normal" xid="32" props="text-align:left; dom-dir:ltr">Start JBoss Enterprise Application Platform 6 or JBoss AS 7 with the Web Profile</p>
<p style="Normal" xid="33">-------------------------</p>
<p style="Normal" xid="34"><c></c></p>
<p style="Normal" xid="35" props="text-align:left; dom-dir:ltr">1. Open a command line and navigate to the root of the JBoss server directory.</p>
<p style="Normal" xid="36" props="text-align:left; dom-dir:ltr">2. The following shows the command line to start the server with the web profile:</p>
<p style="Normal" xid="37"><c></c></p>
<p style="Normal" xid="38" props="text-align:left; dom-dir:ltr">        For Linux:   JBOSS_HOME/bin/standalone.sh</p>
<p style="Normal" xid="39" props="text-align:left; dom-dir:ltr">        For Windows: JBOSS_HOME\bin\standalone.bat</p>
<p style="Normal" xid="40"><c></c></p>
<p style="Normal" xid="41"> </p>
<p style="Normal" xid="42" props="text-align:left; dom-dir:ltr">Build and Deploy the Quickstart</p>
<p style="Normal" xid="43">-------------------------</p>
<p style="Normal" xid="44"><c></c></p>
<p style="Normal" xid="45" props="text-align:left; dom-dir:ltr">_NOTE: The following build command assumes you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line. See [Build and Deploy the Quickstarts](../README.md#build-and-deploy-the-quickstarts) for complete instructions and additional options._</p>
<p style="Normal" xid="46"><c></c></p>
<p style="Normal" xid="47" props="text-align:left; dom-dir:ltr">1. Make sure you have started the JBoss Server as described above.</p>
<p style="Normal" xid="48" props="text-align:left; dom-dir:ltr">2. Open a command line and navigate to the root directory of this quickstart.</p>
<p style="Normal" xid="49" props="text-align:left; dom-dir:ltr">3. Type this command to build and deploy the archive:</p>
<p style="Normal" xid="50"><c></c></p>
<p style="Normal" xid="51" props="text-align:left; dom-dir:ltr">        mvn clean package jboss-as:deploy</p>
<p style="Normal" xid="52"><c></c></p>
<p style="Normal" xid="53" props="text-align:left; dom-dir:ltr">4. This will deploy `target/stuffsystem.ear` to the running instance of the server.</p>
<p style="Normal" xid="54"><c></c></p>
<p style="Normal" xid="55"><c></c></p>
<p style="Normal" xid="56" props="text-align:left; dom-dir:ltr">Access the application </p>
<p style="Normal" xid="57">---------------------</p>
<p style="Normal" xid="58"><c></c></p>
<p style="Normal" xid="59" props="text-align:left; dom-dir:ltr">The application will be running at the following URL: &lt;http://localhost:8080/stuffsystem-web&gt;.</p>
<p style="Normal" xid="60"><c></c></p>
<p style="Normal" xid="61" props="text-align:left; dom-dir:ltr">1. Enter a name, email address, and Phone nubmer in the input field and click the _Register_ button.</p>
<p style="Normal" xid="62" props="text-align:left; dom-dir:ltr">2. If the data entered is valid, the new member will be registered and added to the _Members_ display list.</p>
<p style="Normal" xid="63" props="text-align:left; dom-dir:ltr">3. If the data is not valid, you must fix the validation errors and try again.</p>
<p style="Normal" xid="64" props="text-align:left; dom-dir:ltr">4. When the registration is successful, you will see a log message in the server console:</p>
<p style="Normal" xid="65"><c></c></p>
<p style="Normal" xid="66" props="text-align:left; dom-dir:ltr">        Registering _the_name_you_entered_</p>
<p style="Normal" xid="67"><c></c></p>
<p style="Normal" xid="68"><c></c></p>
<p style="Normal" xid="69" props="text-align:left; dom-dir:ltr">Undeploy the Archive</p>
<p style="Normal" xid="70">--------------------</p>
<p style="Normal" xid="71"><c></c></p>
<p style="Normal" xid="72" props="text-align:left; dom-dir:ltr">1. Make sure you have started the JBoss Server as described above.</p>
<p style="Normal" xid="73" props="text-align:left; dom-dir:ltr">2. Open a command line and navigate to the root directory of this quickstart.</p>
<p style="Normal" xid="74" props="text-align:left; dom-dir:ltr">3. When you are finished testing, type this command to undeploy the archive:</p>
<p style="Normal" xid="75"><c></c></p>
<p style="Normal" xid="76" props="text-align:left; dom-dir:ltr">        mvn jboss-as:undeploy</p>
<p style="Normal" xid="77"><c></c></p>
<p style="Normal" xid="78"><c></c></p>
<p style="Normal" xid="79" props="text-align:left; dom-dir:ltr">Run the Arquillian Tests </p>
<p style="Normal" xid="80">-------------------------</p>
<p style="Normal" xid="81"><c></c></p>
<p style="Normal" xid="82" props="text-align:left; dom-dir:ltr">This quickstart provides Arquillian tests. By default, these tests are configured to be skipped as Arquillian tests require the use of a container. </p>
<p style="Normal" xid="83"><c></c></p>
<p style="Normal" xid="84" props="text-align:left; dom-dir:ltr">_NOTE: The following commands assume you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line. See [Run the Arquillian Tests](../README.md#run-the-arquillian-tests) for complete instructions and additional options._</p>
<p style="Normal" xid="85"><c></c></p>
<p style="Normal" xid="86" props="text-align:left; dom-dir:ltr">1. Make sure you have started the JBoss Server as described above.</p>
<p style="Normal" xid="87" props="text-align:left; dom-dir:ltr">2. Open a command line and navigate to the root directory of this quickstart.</p>
<p style="Normal" xid="88" props="text-align:left; dom-dir:ltr">3. Type the following command to run the test goal with the following profile activated:</p>
<p style="Normal" xid="89"><c></c></p>
<p style="Normal" xid="90" props="text-align:left; dom-dir:ltr">        mvn clean test -Parq-jbossas-remote </p>
<p style="Normal" xid="91"><c></c></p>
<p style="Normal" xid="92"><c></c></p>
<p style="Normal" xid="93" props="text-align:left; dom-dir:ltr">Investigate the Console Output</p>
<p style="Normal" xid="94">---------------------</p>
<p style="Normal" xid="95" props="text-align:left; dom-dir:ltr">You should see the following console output when you run the tests:</p>
<p style="Normal" xid="96"><c></c></p>
<p style="Normal" xid="97" props="text-align:left; dom-dir:ltr">    Results :</p>
<p style="Normal" xid="98" props="text-align:left; dom-dir:ltr">    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0</p>
<p style="Normal" xid="99"><c></c></p>
<p style="Normal" xid="100"><c></c></p>
<p style="Normal" xid="101" props="text-align:left; dom-dir:ltr">Investigate the Server Console Output</p>
<p style="Normal" xid="102">---------------------</p>
<p style="Normal" xid="103" props="text-align:left; dom-dir:ltr">You should see messages similar to the following:</p>
<p style="Normal" xid="104"><c></c></p>
<p style="Normal" xid="105" props="text-align:left; dom-dir:ltr">    INFO  [org.jboss.as.server] (management-handler-thread - 9) JBAS018559: Deployed "test.war"</p>
<p style="Normal" xid="106" props="text-align:left; dom-dir:ltr">    INFO  [com.stuffsystem.controller.MemberRegistration] (http--127.0.0.1-8080-2) Registering Jane Doe</p>
<p style="Normal" xid="107" props="text-align:left; dom-dir:ltr">    INFO  [com.stuffsystem.test.MemberRegistrationTest] (http--127.0.0.1-8080-2) Jane Doe was persisted with id 1</p>
<p style="Normal" xid="108" props="text-align:left; dom-dir:ltr">    INFO  [org.jboss.weld.deployer] (MSC service thread 1-6) JBAS016009: Stopping weld service for deployment test.war</p>
<p style="Normal" xid="109" props="text-align:left; dom-dir:ltr">    INFO  [org.jboss.as.jpa] (MSC service thread 1-1) JBAS011403: Stopping Persistence Unit Service 'test.war#primary'</p>
<p style="Normal" xid="110" props="text-align:left; dom-dir:ltr">    INFO  [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-1) HHH000227: Running hbm2ddl schema export</p>
<p style="Normal" xid="111" props="text-align:left; dom-dir:ltr">    INFO  [org.hibernate.tool.hbm2ddl.SchemaExport] (MSC service thread 1-1) HHH000230: Schema export complete</p>
<p style="Normal" xid="112" props="text-align:left; dom-dir:ltr">    INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-5) JBAS010409: Unbound data source [jboss/datasources/stuffsystemTestDS]</p>
<p style="Normal" xid="113" props="text-align:left; dom-dir:ltr">    INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) JBAS015877: Stopped deployment test.war in 19ms</p>
<p style="Normal" xid="114" props="text-align:left; dom-dir:ltr">    INFO  [org.jboss.as.server] (management-handler-thread - 10) JBAS018558: Undeployed "test.war"</p>
<p style="Normal" xid="115"><c></c></p>
<p style="Normal" xid="116"><c></c></p>
<p style="Normal" xid="117" props="text-align:left; dom-dir:ltr">Run the Quickstart in JBoss Developer Studio or Eclipse</p>
<p style="Normal" xid="118">-------------------------------------</p>
<p style="Normal" xid="119" props="text-align:left; dom-dir:ltr">You can also start the server and deploy the quickstarts from Eclipse using JBoss tools. For more information, see [Use JBoss Developer Studio or Eclipse to Run the Quickstarts](../README.md#use-jboss-developer-studio-or-eclipse-to-run-the-quickstarts) </p>
<p style="Normal" xid="120"><c></c></p>
<p style="Normal" xid="121"><c></c></p>
<p style="Normal" xid="122" props="text-align:left; dom-dir:ltr">Debug the Application</p>
<p style="Normal" xid="123">---------------------</p>
<p style="Normal" xid="124"><c></c></p>
<p style="Normal" xid="125" props="text-align:left; dom-dir:ltr">If you want to debug the source code or look at the Javadocs of any library in the project, run either of the following commands to pull them into your local repository. The IDE should then detect them.</p>
<p style="Normal" xid="126"><c></c></p>
<p style="Normal" xid="127" props="text-align:left; dom-dir:ltr">        mvn dependency:sources</p>
<p style="Normal" xid="128" props="text-align:left; dom-dir:ltr">        mvn dependency:resolve -Dclassifier=javadoc</p>
<p style="Normal" xid="129"></p>
</section>
</abiword>
