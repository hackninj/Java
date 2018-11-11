--SYNTAX:
SELECT column1, column2, ...
FROM table_name;



--SELECT All columns from Products
SELECT  * FROM Products;


-- SELECT 2 columns FROM Suppliers
SELECT SupplierName, ContactName
FROM Suppliers;


--WHERE condition
SELECT *
FROM Customers
WHERE City = 'Buenos Aires';


SELECT *
FROM Customers
WHERE CustomerID > 86


-- NOT:
SELECT *
FROM [Shippers]
WHERE ShipperName <> 'Speedy Express'

-- NOT:
SELECT *
FROM [Shippers]
WHERE ShipperName != 'Speedy Express'


--BETWEEN:
SELECT *
FROM [Customers]
WHERE CustomerID BETWEEN 40 AND 45


--IN:
SELECT *
FROM [Customers]
WHERE Country IN ('Germany', 'France', 'Canada')


--LIKE:
--ends with:
SELECT * FROM Customers
WHERE Country LIKE '%land';


--LIKE:
--starts with:
SELECT * FROM Customers
WHERE Country LIKE 'g%';


--LIKE:
--contains:
SELECT * FROM Customers
WHERE Country LIKE '%er%';

--WILDCARDS:
SELECT * FROM Customers
WHERE Country LIKE '_e%'


--NOT:
SELECT * FROM Customers
WHERE NOT Country='Germany';


--OR:
SELECT * FROM Customers
WHERE City='Berlin' OR City='München';

--AND:
SELECT * FROM Customers
WHERE Country='Germany' AND City='Berlin';





--Inner JOIN
SELECT *
FROM Products JOIN Categories
ON Products.CategoryID = Categories.CategoryID
WHERE CategoryName LIKE 'B%'


--Inner JOIN
SELECT * FROM Products JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
WHERE SupplierName LIKE 'Mayumi%s' AND Price > 20


--Join Multiple Tables:
SELECT *
FROM Products
JOIN Suppliers
ON Products.SupplierID = Suppliers.SupplierID
JOIN Categories
ON Products.CategoryID = Categories.CategoryID


--SELECT ALL CustomerNames That Ordered Chais
----Join Multiple Tables:
SELECT CustomerName

FROM OrderDetails
JOIN Products
ON OrderDetails.ProductID = Products.ProductID
JOIN Orders
ON Orders.Orderid = OrderDetails.OrderID
JOIN Customers
ON Customers.CustomerID = Orders.CustomerID

WHERE ProductName = "Chais"




--CREATE TABLE:
CREATE TABLE Students(
	  id INTEGER,
    firstName VARCHAR(18), --TEXT    i18n
    lastName VARCHAR(18),
	  email TEXT
)


--INSERT
INSERT INTO Students(id, firstName, lastName, email)
VALUES (2, 'Dani', 'Din', 'Din@gmail.com')

UPDATE Customers
SET CustomerName = 'Moshe'
WHERE CustomerID = 1


DELETE FROM Customers
WHERE City LIKE 'c%'





DROP TABLE Categories

