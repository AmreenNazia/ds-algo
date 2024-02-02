Feature: To test the functionality of Register link

@valid
  Scenario Outline: Check Register is successful with valid Credentials
    Given  user is in Register page
    And user clicks on Register
    When user enters <username> and <password> and <confirm_password>
    And click reigster button
    Then user should get registered and navigates to home page
    
    Examples: 
      | username   | password  | confirm_password |
      | Davidscott | Test@BDD  | Test@BDD         |
 