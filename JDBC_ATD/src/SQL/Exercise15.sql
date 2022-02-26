/*Exercise 15 : Write a query to get 3 minimum salaries from Employees table.*/

SELECT first_name, last_name, salary 
FROM employees 
WHERE employees.salary = (SELECT min_salary
FROM jobs
WHERE employees.job_id = jobs.job_id);