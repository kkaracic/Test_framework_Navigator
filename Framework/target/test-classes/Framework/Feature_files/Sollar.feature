@sollar
Feature: Taking irradiation data from solar gis
User should be able to easily get data

Scenario: Getting data
		
	Given the user opens Solargis site
	And the user enters two random coordinates
	And the user clicks Go
	And the user enters slope and azimuth
	And the user clicks calculate again
	And the user now turns loop into entering data
	And the user clicks Go again
	When the user clicks on the Calculate button
	Then the user verifies that the data is displayed
