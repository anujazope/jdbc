/*Exercise 14 : Write a query to get 3 maximum salaries from Employees table.*/

SELECT first_name, last_name, salary FROM employees 
WHERE salary > (SELECT AVG(salary) FROM employees);