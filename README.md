# CucumberBDD
 java , TestNG , maven , CucumberBDD, Gherkin , Git etc
 
# How to run
 To run full test suite  you just say "mvn verify"
# Customize run
       

 mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@signIn"
 User should provide us environment type and browser type
 Example env = qa or stag or prod and browser = ch or edge