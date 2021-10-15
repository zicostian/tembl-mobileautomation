@BL
Feature: Login Failed

  @tag1
  Scenario: User should be able to see incorrect credential message
  Given Launch apk sample in Android
  Then User should be navigated to home screen
  And User enter username "zico5@mailinator.com"
  And User enter password "Welcome@124"
  When User tap login button
  Then User should be able to see incorrect credential message