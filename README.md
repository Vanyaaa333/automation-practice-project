# Training test Framework of online store website
## Training project on UI testing automation in Java with Selenium.Testing of "http://automationpractice.com/" website.

###Following patterns were used:

1. Page Object
2. Loadable Page/Component
3. Value object
4. Chain of invocation
5. Steps

###Following technologies were used:
1. Selenium
2. Maven
3. TestNG
4. Allure Reporting
5. Jenkins
6. Log4J
7. Lombok

# Test cases
## Test suite 1 - Login Tests
### Test case 1.1 - Login test with valid Email and Password
| Step | Description | Expected result |
| --- | --- | --- | 
| 1 | Enter valid Email and Password | Successful validation. There are no error messages. | 
### Test case 1.2 - Login test with invalid Email and Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter invalid Email and Password | Failed validation. Error messages. | 
### Test case 1.3 - Login test with valid Email and invalid Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter valid Email and invalid Password | Failed validation. Error messages. |
### Test case 1.4 - Login test with invalid Email and valid Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter invalid Email and valid Password | Failed validation. Error messages. | 
### Test case 1.5 - Login test with empty Email and Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter empty Email and Password | Failed validation. Error messages. | 
### Test case 1.6 - Login test with empty Email and valid Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter empty Email and valid Password | Failed validation. Error messages. | 
### Test case 1.7 - Login test with valid Email and empty Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter valid Email and empty Password | Failed validation. Error messages. | 
