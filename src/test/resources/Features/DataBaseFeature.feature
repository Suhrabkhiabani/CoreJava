Feature: DataBase SQL Query Feature 

@testingdatabase
Scenario: Execute all information from Actor table 
	Given User Connects to PostgreSql DataBase 
	When User send query 'select description from public.film' 
	Then User should get all information from that table 
