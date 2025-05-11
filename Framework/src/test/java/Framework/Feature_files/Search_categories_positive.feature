Feature: Searching for Categories on the map
User should be able to see objects from the category he/she has chosen

Scenario Outline: Searching for Categories on the map
		
	Given the user opens Navigator site
	When the user cliks <Category>
	Then the user verifies the proper objects from the category are listed

Examples:
|		Category		|
|Sarajevska pozorišta	|
|NEXTBIKE				|
|SMOKE-FREE PUBLIC PLACES|
|SMJEŠTAJ				|
|KAFA					|
|HRANA					|
|NOĆNI ŽIVOT			|
|KUPOVINA				|
|ATRAKCIJE				|
|UMJETNOST I ZABAVA		|
|SPORT					|
|PREVOZ					|
|USLUGE					|
|BIZNIS					|
|GRADSKE ULICE			|
