# Write your MySQL query statement below
select c.name from Customer c join Customer c2 using (id)
where c.referee_id is null or c.referee_id!=2