--Select
--ANSII
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers

Select * from Customers where City = 'Berlin'

Select * from Products where categoryId=1 or categoryId=3

Select * from Products where categoryId=1 and UnitPrice>=10

Select * from Products where categoryId=1 order by UnitPrice desc  --ascending --descending 

Select count(*) Adet from Products where CategoryId=2

Select categoryID from products where unitPrice>20 group by CategoryID having count(*)<10

Select Products.ProductId, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryId = Categories.CategoryID
where Products.UnitPrice>10

--DTO Data Transformation Object

Select * from Products p inner join [Order Details] od
on p.ProductID = od.ProductID
inner join Orders o
on o.OrderID = od.OrderID

Select * from Customers c left join Orders o 
on c.CustomerID = o.CustomerID
where o.CustomerID is null