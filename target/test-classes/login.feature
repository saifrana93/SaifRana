 Feature: user login mechanism
  As a user in order to get all benefits from gmail account  
  I want to login successfully

  Background: Landing on gmail home page
            Given I open browser
            And I land on gmail account page
   
 @nr
  Scenario: login successfully
  
        When I complete Login With nr nr
        #And I expect to see profile name as nr nr  
        #And I want to look for desired email
        Then I expect to select specific email by name and delete them
        
       

