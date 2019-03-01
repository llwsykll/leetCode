# Write your MySQL query statement below
delete pa from Person pa,Person pb
where pa.Email = pb.Email and pa.id>pb.id;