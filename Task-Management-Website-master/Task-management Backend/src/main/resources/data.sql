insert into task (id,title,description,start_date,due_date,status,now,peopleworking,priority) 
values(10001,'Design Homepage','Create a visually appealing homepage layout with a hero banner, navigation menu, and featured content',CURRENT_DATE(),CURRENT_DATE()+60,'completed',2,'Rahul Aditya','High');

insert into task (id,title,description,start_date,due_date,status,now,peopleworking,priority) 
values(10002,'Backend API Development','Build RESTful API endpoints for user authentication, task management, and data storage.',CURRENT_DATE(),CURRENT_DATE()+60*24,'working',3,'Mayank Harsh','low');

insert into task (id,title,description,start_date,due_date,status,now,peopleworking,priority) 
values(10003,'Database Optimization','Optimize database queries and indexing for faster data retrieval and improved overall performance',CURRENT_DATE(),CURRENT_DATE()+60*12,'pending',4,'Rahul Aditya','medium');