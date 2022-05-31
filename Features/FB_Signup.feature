
Feature: validate facebook signup feature
  

  @FB_signup
  Scenario Outline: validate facebook signup 
    Given launch FB URL
    When user click on create new account button
    When user type "<Fast Name>" and "<Last Name>" and "<Email Add>" and "<New Password>"
    When user select dropdown Month and dropdown Day and dropdown Year
    When user select gender and click on signup button 
    Then user will get virification code
  

  

    Examples: 
      | Fast Name  | Last Name| Email Add                   |New Password|
      | Team       |Fortune   | teamfortunetest@hotmail.com | Sylhet123 | 
      
