Feature: Creating a new idea
User should not be able to add a new idea for improving the application if the email is invalid

Scenario Outline: Creating a new object
		
	Given the user opens Navigator site
	And the user clicks on the "Predloži ideju-pošalji komentar" button
	And the user enters "Mujo Mujić" in the name and the surnname
	And the user enters the invalid email address
	And the user enters <Komentar>
	And the user choose <Pohvala_ili_kritika>
	When the user cliks <Button>
	Then the user verifies the <Result>

Examples:
|		Komentar		|	Pohvala_ili_kritika	|	Button	|		Result											|
|		Sve pohvale		|		Pohvala			|	Pošalji	|Idea not submitted, user get info about the wrong email|
|		Sve pohvale		|		Pohvala			|  Odustani	|	Returning to the main page 							|
|		Ima grešaka		|		Kritika			|	Pošalji	|Idea not submitted, user get info about the wrong email|
|		Sve pohvale		|		Kritika			|  Odustani	|	Returning to the main page 							|