@Autenticacion
Feature: I as a user want to authenticate in the application eribank to check my credentials

  @TestCase1
  Scenario Outline: Login to the Eribank application
    When I try to login myself using my data authentication
      |  user  |  pass |
      | <user> | <pass>|
    Then I should see the home balance page

    Examples:
      | user | pass |
      ##@externaldata@./src/test/resources/datadriven/autenticacion/data.xlsx@Datos
   |company   |company|
