SELECT DISTINCT salesman_id from orders;
SELECT order_no FROM orders ORDER BY order_date ASC;
SELECT order_no FROM orders ORDER BY purchase_amount DESC;
SELECT * FROM orders WHERE purchase_amount<500;
SELECT * FROM orders WHERE purchase_amount BETWEEN 1000 AND 2000;
