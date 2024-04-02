

Feature: Tenant 
  I want to use this template for my feature file


  Scenario: To Rent a home option
   Given user is logged into the website
   When the user selects All india option a dropdown is visable
   Then the user selects view top cities 
   Then the user selects Hyderabad has option
   Then selects For tenats as option
   Then the user selects rent a home option
   Then selects independent house as option
   Then selects a filter
   Then selects the desired property 

  Scenario: Pg/Co living option
   Given user is logged into the website
   When the user selects For tenats as option
   Then the user selects pg/co living option
   Then the user selects pg in hyderabad as option
   Then the user selects multiple filter
   Then the user selects the desired pg
   Then the user shotlists the property and contacts the owner
 
  Scenario: Commercial option
   Given user is logged into the website
   When the user selects For tenats as option
   Then the user selects commercial option
   Then the user selects commercial property for rent in hyderabad as option
   Then the user selects few filters
   Then the user will shotlist the property and contacts the owner

  Scenario: Rent a home
   Given user is logged into the website
   When the user selects For tenats as option
   Then the user selects rent a home as option
   Then the user selects for rent in Mumbai as option
   Then the user selects filters
   Then the user shotlists the property and contacts owner
 
  Scenario: Insights
    Given user is logged into the website
    When the user selects For tenats as option 
    When the user selects the Insights as option
    Then the user will select ratings and review as option
    Then the user will select hyderabad reviews and scroll
@sanitytest
   Scenario Outline: Pg/Co living 
   Given user is logged into the website
   When the user selects For tenats as option
   Then the user selects pg/co living option
   Then the user selects pg in hyderabad as option
   Then the user selects multiple filter
   Then the user selects the desired pg
   Then the user clicks on contact Owner 
   Then enters the name <name>
   Then enters the phonenumber <phone>
   Then enters the email <email>
   
   Examples:
   | name | phone | email |
   | "Sudeepthi" | "8985014994" | "kotasudeepthi@gmail.com" |
  
   
    
    