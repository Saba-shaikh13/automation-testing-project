Feature:demoblaze sign up and login
Background:
Given launch demoblaze website
Scenario: verify user can create account sucessfully on demoblaze website

When user click on sign up button 
And  user enter username 
And user enter password
And click on signup button
Then login should be successfull

Scenario: verify  demoblaze login 
When user click on login button 
And  user enter registered username and password
And click on login button
Then demoblaze login successfull





