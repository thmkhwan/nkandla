# nkandla

Were are going to create a representation for the infamous Nkandla homestead.

A HomeStead has a
-Name
-District
-Province
-Country
-Accept method that takes in a visitor and calls “visit(this)”
	It should only accept visitors with the correct personType of PRESIDENT else throw an Exception

Nkandla is a HomeStead

Nkandla has a
-Swimming pool
-Chicken run
-Amphitheatre

A person has a
-Name
-Age
-Gender
-Type (create a Enum called personType)

Politician is a specialized type of person

Politicians have a
-Political party

Jacob Zuma is a Politician with the type of personType – “PRESIDENT”
Jacob Zuma has a
-Lawyer (personType)
-Architect (personType)

A visitor is an interface with a “visit(HomeStead)” method

Create Politician instances called “Helen Zille”, “Julius Malema” and "Jacob Zuma" which implements the visitor interface

Make the 3 people try and visit Nkandla