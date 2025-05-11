Feature: Making two to-do items
User should be able to make at least two to-do items after clicking on the Polymer link 

Background:
	Given the user opens the todomvc site
	And the user clicks on the JavaScript tab
	And the user clicks on the Polymer link

Scenario: Making two to-do items in English language
	When the user enters some text in the to-do label
	And the user presses Enter on keyboard
	And the user enters some text again in the to-do label
	And the user presses Enter on keyboard again
	Then the user verifies that the two items are present on the list equal to the ones that the user entered
	
Scenario: Making two to-do items in Chinese language
	When the user enters 去商" in the to-do label
	And the user presses Enter key on keyboard
	And the user enters 买一些产品 in the to-do label
	And the user presses Enter key on keyboard again
	Then the user verifies that the two items are present on list equal to the ones that the user entered
	
Scenario: Giving no input and then pressing Enter key
	When the user enters no text in input
	And the user presses the Return key
	Then the user verifies that no new task is added

Scenario: Entering a completed task
	When the user enters first task in input
	And the user presses Enter key
	And the user clicks on the Completed label
	And the user enters the second task
	And the user presses the Enter key again
	And the user clicks on the All label
	Then the user verifies that the two active tasks are on the menu