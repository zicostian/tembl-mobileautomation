@BL
Feature: Register and Login

  @tag1
  Scenario: User should be able to Register and Login
  Given Launch apk sample in Android
  Then User should be navigated to home screen
  When User tap register link in home screen
  Then User should be navigated to register screen
  And User enter name "Zico"
  And User enter email "zico7@mailinator.com"
  And User enter register password "Welcome@123"
  And User enter confirm password "Welcome@123"
  When User tap Create Register button
  Then User should stay in registration screen
  When User tap Login link
  Then User should be navigated to home screen
  And User enter username "zico7@mailinator.com"
  And User enter password "Welcome@123"
  When User tap login button
  Then User should be navigated to account screen