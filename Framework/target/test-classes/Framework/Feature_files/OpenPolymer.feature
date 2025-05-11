Feature: Open Polymer link from the webpage
User should be able to open the correct webpage with the Polymer link

Background:
	Given the user navigates to the todomvc site
	And the user click on the JavaScript tab
	
Scenario: Open correct URL when Polymer link is clicked
	When the user clicks on the Polymer link
	Then the user verifies that the correct webpage with to-do list is opened
	
Scenario: Presence of the todos logo
	When user clicks on the Polymer link
	Then the user verifies that the opened webpage has the headline todos
	
Scenario: Presence of the todos labels
	When the user click on the Polymer link
	Then the user verifies that the opened webpage has the input for entering todo list
	And the user verifies that input has the label What needs to be done? in the back

