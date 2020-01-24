
  Feature: Test login functionality for demowebshop
  @valid
  Scenario:Test demowebshop with valid credentials
  Given open chrome and start application
  When I enter valid username and password
  Then user should be able to login 
  
  @invalid
  Scenario: Test demowebshop with invalid credentials
  Given start application
  When I enter invalid username and password
  Then user should not able to login  
  
  
