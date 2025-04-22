Feature: SpiceJet Flight Booking

  @WEB @TEST1 @TC_ID_1001
  Scenario Template: Launch SpiceJet Website and Validate URL is valid
    Given As a user i should launch SpiceJet Website
    Then I should validate SpiceJet URL "<Current URL>" is valid

    Examples:
      | Current URL   |
      | &CURRENT URL& |

  @WEB @TEST12 @TC_ID_1002 @TC_ID_1003 @TC_ID_1004
  Scenario Template: Create Account in SpiceJet with No Test Data and Invalid Data
    Given As a user i should SpiceJet navigate to Create Account page
    And I should not enter any data in SpiceJet input fields and Click on Create an Account button
    Then I should check the SpiceJet mandatory fields "<Validation Messages>" validation messages
    And I should enter SpiceJet invalid data "<Invalid Data>" in input fields and Click on Create an Account button
    Then I should check all SpiceJet invalid messages "<Invalid Validation Messages>" are displayed
    And I should enter SpiceJet valid data "<Valid Data>" in input fields and Click on Create an Account button
    Then I should check SpiceJet account is created successfully

    Examples:
      | Validation Messages   | Invalid Data   | Invalid Validation Messages   | Valid Data   |
      | &VALIDATION MESSAGES& | &INVALID DATA& | &INVALID VALIDATION MESSAGES& | &VALID DATA& |

  @WEB @TEST12 @TC_ID_1005
  Scenario Template: Login with Existing User
    Given As a user i should navigate to Spicejet Sign In button
    When I enter Spicejet UserName "<UserName>" and click Continue
    When I select Use Spicejet Password "<Password>" ,enter Password and click Continue
    Then I should check account Spicejet is logged in successfully
    Examples:
      | UserName   | Password   |
      | &USERNAME& | &PASSWORD& |

  @WEB @TEST12 @TC_ID_1006
  Scenario Template: Check flight not available for respective route
    Given As a user i should click on Flights Tab
    When I enter all flight details "<WrongFlightDetails>" in the Flights tab
    And I should click on Search Flight
    Then I should check Flight is not available for the entered datetime
    Examples:
      | WrongFlightDetails   |
      | &WRONGFLIGHTDETAILS& |

  @WEB @TEST1 @TC_ID_1007
  Scenario Template: Check Flight One Way trip can be booked successfully
    Given As a user i should click on Flights Tab
    When I enter all One Way flight details "<OneWayFlightDetails>" in the Flights tab
    And I should click on Search Flight
    And I should check Flight is available and Click Continue
    And I should enter contact Details "<ContactDetails>" in Passengers Page
    And I should click on Primary Passenger checkbox
    And I should click on Continue button in Trip Summary page
    And I should click on Continue button in Add Ons Trip Summary page
    And I should enter card details "<CardDetails>" in the page and Click Proceed to Pay
    Then I should check flight booking is successfull
    Examples:
      | OneWayFlightDetails   | ContactDetails   | CardDetails   |
      | &ONEWAYFLIGHTDETAILS& | &CONTACTDETAILS& | &CARDDETAILS& |

  @WEB @TEST12 @TC_ID_1008
  Scenario Template: Check Flight Two Way trip can be booked successfully
    Given As a user i should click on Flights Tab
    When I enter all Two Way flight details "<TwoWayFlightDetails>" in the Flights tab
    And I should click on Search Flight
    And I should check Flight is available and Click Continue
    And I should enter contact Details "<ContactDetails>" in Passengers Page
    And I should click on Primary Passenger checkbox
    And I should click on Continue button in Trip Summary page
    And I should click on Continue button in Add Ons Trip Summary page
    And I should enter card details "<CardDetails>" in the page and Click Proceed to Pay
    Then I should check flight booking is successfull
    Examples:
      | TwoWayFlightDetails   | ContactDetails   | CardDetails   |
      | &TWOWAYFLIGHTDETAILS& | &CONTACTDETAILS& | &CARDDETAILS& |