## FACEBOOK TEST SCENARIOS

* Test Environment : https://www.facebook.com
* Test Data 
  * For generate dummy email, use https://temp-mail.org/en/
  * For Firstname and Lastname generate dummy data for each attempt again & again
  * For Date of birth use randoms

### SCENARIO: Sign Up With Valid Credentials
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide valid first name, last name, email, password, date of birth and gender
* Then click the "Sign Up" button
* Then verify email verification page opened
* And provide verification code from your email address
* And click "Continue" button
* And verify "Account Confirmed" pop up opened
* Then click "OK" for activation
* Then verify user accessed the user page and account activated

### SCENARIO: Sign Up With Missed First Name Inputs
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide valid last name, email, password, date of birth and gender
* Then click the "Sign Up" button
* And verify first name input borders turns to red and warning sign appear in the input box
* Then click the warning sign
* And verify the information pop up appeared

### SCENARIO: Sign Up With Missed Last Name Inputs
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide valid first name, email, password, date of birth and gender
* Then click the "Sign Up" button
* And verify last name input borders turns to red and warning sign appear in the input box
* Then click the warning sign
* And verify the information pop up appeared

### SCENARIO: Sign Up With Missed Email And Password
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide valid first name, last name, date of birth and gender
* Then click the "Sign Up" button
* And verify email and password inputs borders turns to red and warning signs appear in the input-boxes
* Then click the warning signs
* And verify the information pop-ups appeared

### SCENARIO: Sign Up With Missed Gender
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide valid first name, last name, date of birth
* Then click the "Sign Up" button
* And verify pop up warning message appeared

### SCENARIO: Gender Options
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* Then click gender other option
* And verify "Select your pronoun" and "Gender" inputs appeared

### SCENARIO: Check Last Days Based On Month
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide valid first name, last name, email, password, gender
* Then select the Last day of month
* Then click the "Sign Up" button
* And verify "The selected date is not valid" message is appeared

### SCENARIO: Password Input Type Bullet Sign
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide text in to password field
* Then verify text type is bullet sign

### SCENARIO: Sign Up With First Name Numbers
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide first name with numbers
* Then provide last name, email, password, date of birth and gender with valid credentials
* Then click the "Sign Up" button
* And verify warning message appeared

### SCENARIO: Sign Up With Last Name Numbers
* Given user on the home page
* When click "Create New Account" button
* Then verify sign up pop up page
* When provide last name with numbers
* Then provide first name, email, password, date of birth and gender with valid credentials
* Then click the "Sign Up" button
* And verify warning message appeared