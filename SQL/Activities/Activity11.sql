SELECT customer_id,customer_name FROM customers a 
WHERE 1 < (SELECT COUNT(*) FROM orders b WHERE a.customer_id=b.customer_id) 
UNION
SELECT salesman_id,salesman_name FROM salesman a
WHERE 1 < (SELECT COUNT(*) FROM orders b WHERE a.salesman_id=b.salesman_id )
ORDER BY customer_name ASC;

SELECT a.salesman_id,a.salesman_name,b.order_no,'highest on',b.order_date FROM salesman a,orders b
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount= (SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date=b.order_date)
UNION
SELECT a.salesman_id,a.salesman_name,b.order_no,'lowest on',b.order_date FROM salesman a,orders b
WHERE a.salesman_id=b.salesman_id AND b.purchase_amount= (SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date=b.order_date)

