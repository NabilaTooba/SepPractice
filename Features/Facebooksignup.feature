Feature: Validate Facebook Signup

Scenario Outline: Validate Facebook Signup

Given User visit Facebook Signup home page
When User type "<firstname>" ,"<lastname>","<mobilenumber>"and "<newpassword>"
Then User select dropdown Month and dropdown Day and dropdown Year
Then user click gender and signup

Examples: 
|firstname|lastname|mobilenumber|newpassword|
|tairan|omar|04067777|tairan777|