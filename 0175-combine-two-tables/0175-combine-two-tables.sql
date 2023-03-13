# Write your MySQL query statement below
SELECT p.firstname,p.lastname,a.city,a.state from person p LEFT  OUTER JOIN address  a on p.PersonId=a.PersonId;