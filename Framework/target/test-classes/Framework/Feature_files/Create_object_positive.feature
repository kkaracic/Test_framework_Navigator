Feature: Creating a new object
User should be able to add a new object on the map

Scenario Outline: Creating a new object
		
	Given the user opens Navigator site
	And the user clicks on the "Kreiraj objekat" button
	And the user enters "Kafić Avenija" in the name of the object in the new form that appears
	And the user enters "Sarajevo" in the city of the object
	And the user enters "Srđana Aleksića" the address of the object
	And the user enters "30" in the number of the object
	And the user enters "71000" the post number
	And the user enters "residential building" in the description
	And the user choose ... in the object category
	And the user choose every day as a working day
	And the user enters woking hours from "07:00" to "23:00"
	And the user enters FacebookURL
	And the user enters InstagramURL
	And the user uploads a photo
	When the user cliks "Kreiraj" button
	Then the user verifies that the new object has been created

Examples:
|kafa|