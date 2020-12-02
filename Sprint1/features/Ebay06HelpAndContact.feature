Feature: EBAY 06 Help and Contact

@HelpAndContact
Scenario: Help and Contact Link Accessiblity
   Given User is in Homepage
   When User click Help and Contact option

@Buying
Scenario: Buying As Guest
   Given User is in Homepage
   When User click Help and Contact option
   Then User Clicks Buy As Guest Option   

@ItemNotRecived
Scenario: Help For Item  Have Not Recived
   Given User is in Homepage
   When User click Help and Contact option
   Then User clicks Get  Help if item has not Arrived Option

@Covid
Scenario Outline: Additional Support In Covid Situation
   Given User is in Homepage
   When User click Help and Contact option
   Then User clicks Additional Support During Covid Page <name>
Examples:
          |name |
         	|Covid| 

@HackedAcc
Scenario: Help Regarding Hacked Account
    Given User is in Homepage
    When User click Help and Contact option
   	Then User clicks Help For Hacked Account Page
 
