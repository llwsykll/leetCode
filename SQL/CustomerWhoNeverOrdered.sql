# Write your MySQL query statement below
select a.Name as Customers 
from Customers a left join Orders o on a.Id = o.CustomerId 
where o.CustomerId is Null;