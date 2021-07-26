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
### Test case 1.8 - Login test with invalid Email with HTML tag and valid Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter invalid Email with HTML tag and valid Password | Failed validation. Error messages. | 
### Test case 1.9 - Login test with invalid Email with different symbols and valid Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter invalid Email with different symbols and valid Password | Failed validation. Error messages. | 
### Test case 1.10 - Login test with invalid Email with white spaces text and valid Password
| Step | Description | Expected result |
| --- | --- | --- |
| 1 | Enter invalid Email with white spaces text and valid Password | Failed validation. Error messages. | 

## Test suite 2 - Actions with product tests
### Test case 2.1 - Actions with product test with add new product
| Step | Description | Expected result |
| --- | --- | --- | 
| 1 | Open women catalog page with main menu button | Women catalog page was opened |
| 2 | Checking that cart is empty | Cart was empty |
| 3 | Select catalog checkboxes | checkboxes was successfully selected |
| 4 | Add selected product to cart | product was added |
| 5 | Open cart with clicking proceed to checkout button | cart was opened |
| 6 | Checking product add | product was added |
### Test case 2.2 - Actions with product test with delete added product
| Step | Description | Expected result |
| --- | --- | --- | 
| 1 | Open women catalog page with main menu button | Women catalog page was opened |
| 2 | Checking that cart is empty | Cart was empty |
| 3 | Add selected product to cart | product was added |
| 4 | Open cart with clicking proceed to checkout button | cart was opened |
| 5 | Checking product add | product was added |
| 6 | Delete product | product was deleted |
| 7 | Checking that cart is empty | Cart was empty |
### Test case 2.3 - Actions with product test with getting more selected product info
| Step | Description | Expected result |
| --- | --- | --- | 
| 1 | Open women catalog page with main menu button | Women catalog page was opened |
| 2 | Get selected product information | information was got |
### Test case 2.3 - Actions with product test with full product buying
| Step | Description | Expected result |
| --- | --- | --- | 
| 1 | Open women catalog page with main menu button | Women catalog page was opened |
| 2 | Checking that cart is empty | Cart was empty |
| 3 | Add selected product to cart | product was added |
| 4 | Open cart with clicking proceed to checkout button | cart was opened |
| 5 | Checking product add | product was added |
| 6 | Open shipping page | Shipping page was opened |
| 7 | Click to agree to the terms checkbox | Checkbox was clicked |
| 8 | Open Payment page | Payment page was opened |
| 9 | Open bank wire payment page | Bank wire payment page was opened |
| 10 | Open oder confirmation page | Oder confirmation page was opened |

## Test suite 3 - Register new user tests
### Test case 3.1 - Actions with product test with add new product
| Step | Description | Expected result |
| --- | --- | --- | 
| 1 | Open login page  | Login page was opened |
| 2 | Fill new user email and click create button | Create an account page was opened |
| 3 | Fill register fields | Fields was filled |
| 4 | Clicking register button | My account page was opened |

## Test suite 4 - My addresses tests
### Test case 4.1 - Actions with product test with add new product
| Step | Description | Expected result |
| --- | --- | --- | 
| 1 | Open login page  | Login page was opened |
| 2 | Fill new user email and click create button | Create an account page was opened |
| 3 | Fill register fields | Fields was filled |
| 4 | Clicking register button | My account page was opened |




