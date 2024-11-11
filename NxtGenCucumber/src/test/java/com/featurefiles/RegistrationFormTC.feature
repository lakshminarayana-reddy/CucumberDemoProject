@TagTwo @retry(1)
Feature: Registering demo user

  Scenario Outline: To test the register user functinality with multiple set of data
    Given user launches the application
    When user navigate to Demo sites
    And naviagte to Practice Automation
    And navigate to Demo Site Registration Form
    And enter FirstName as "<FirstName>",LastName as "<LastName>" and select Gender as "<Gender>"
    And enter StreetAddress as "<StreetAddress>",BuildingName as "<BuildingName>", City as "<City>", State as "<State>", Zipcode as "<Zipcode>" and select country as "<Country>"
    And email as "<email>", Date as "<Date>", Month as "<Month>", Year as "<Year>" ConvinientTimeHour as "<Hour>", ConvinientTimeMin as "<Min>" and MobileNumber as "<MobileNumber>"
    And Select course1 as "<CourseOne>", Course2 as "<CourseTwo>" and Course3 as "<CourseThree>"
    And enter Query as "<Query>", Verification Number as "<VerNum>" and click on submit
    Then Registration is successful
    And validate Registration Number
    And close the application

    Examples: 
      | FirstName | LastName | Gender | StreetAddress | BuildingName | City      | State     | Zipcode | Country | email          | Date | Month | Year | Hour | Min | MobileNumber | CourseOne          | CourseTwo | CourseThree        | Query      | VerNum |
      | Sai       | Charan   | Male   | Madhapur      | SaiKuteer    | Hyderabad | Telangana |  500081 | India   | abcd@gmail.com |   17 |    07 | 2025 |   07 |  10 | 689461268961 | Selenium WebDriver | TestNG    | Core Java          | Test Query |     99 |
      | Charan    | Sai      | Male   | Madhapur      | Sai Kuteer   | Hyderabad | Telangana |  500081 | India   | efgh@gmail.com |   31 |    05 | 2025 |   07 |  10 |   9874965169 | Selenium WebDriver | TestNG    | Functional Testing | Test query |     99 |
