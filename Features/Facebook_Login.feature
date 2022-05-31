Feature: Vatidate Facebook login

  Scenario Outline: 
    Given launch Facebook URL
    When user type valid "<email>" and invalid "<password>"
    When user click on log in button
    Then user able to login succesfully
    
    Scenario Outline: 
    Given launch Facebook URL
    When user type empty "<>" and empty "<>"
    When user click on log in button
    Then user unable to login  
    
    Scenario Outline: 
    Given launch Facebook URL
    When user type  "<email>" and empty password "<>"
    When user click on log in button
    Then user unable to login  
    
    Scenario Outline: 
    Given launch Facebook URL
    When user type empty email "<>" and valid "<password>"
    When user click on log in button
    Then user unable to login 
    
    Scenario Outline: 
    Given launch Facebook URL
    When user type valid "<email>" and valid "<password>"
    When user click on log in button
    Then user able to login succesfully 

    Examples: 
      | email                    | password   |
      | sharif_fahmi@hotmail.com | Inaya1176@  |
 
      
      
      
      