Feature: Gmail login

Scenario: verify login sucessful when user enter valid username and password
Given user should create the account on gmail
When launch the website,enter email and password,click on login button
Then gmail login should be successfull



