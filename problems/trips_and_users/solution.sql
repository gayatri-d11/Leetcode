# Write your MySQL query statement below
select t.request_at as Day , 
round(
 sum(if(t.status!="completed",1,0))/count(*) ,2

)  as 'Cancellation Rate'
from Trips t
join Users c on c.users_id = t.client_id  and c.banned = 'No' 
join Users d on d.users_id = t.driver_id and d.banned = 'No'
WHERE t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
group by t.request_at
