Feature: negative fb login

Scenario: verify login failed when user enter invalid credential 
Given chrome browser should be invoked
And fb login page should be visible
When Enter username "Fct@gmail.com" and password "FCT123"
And user click on login button on fb login page
Then login failed when user enter invalid credentials



