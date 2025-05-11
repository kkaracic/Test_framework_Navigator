Feature: Making two to-do items
User should be able to edit the second to-do item



Scenario Outline: Editing the second item
		
	Given the user opens Polymer site
	And the user enters two tasks
	When the user does "<Click>" on the second item
	Then the user verifies that the second item is "<State>"

Examples:

	|   Click    |     State    |
	| One click  | Not editable |
	|Double click|    Editable  |
	
