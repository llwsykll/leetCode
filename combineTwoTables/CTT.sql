# Write your MySQL query statement below
select a.City,a.State,p.FirstName,p.LastName from Person p left join  Address a on a.PersonId = p.PersonId;