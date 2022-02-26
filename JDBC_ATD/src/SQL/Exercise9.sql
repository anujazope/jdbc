/*Exercise 9:  Write a SQL statement to find the names of all customers along with 
the salesmen who works for them*/

SELECT *
FROM customer a,orders  b 
WHERE a.customer_id=b.customer_id 
AND b.ord_date='2012-10-05';