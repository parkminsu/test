*exists ~ 
	select count(*) 
   		from information_schema.system_tables 
   		where TABLE_SCHEM = 'PUBLIC' 
   			and table_name = 'PRODUCTS'; 
 
*if (*{exists} == 0) 
	select count(*) from information_schema.system_tables;
	CREATE TABLE PRODUCTS (
  		id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) NOT NULL,
  		name varchar(50),
  		description varchar(255),
 	 	price decimal(15,2),
  		PRIMARY KEY (id)
	); 
*end if 

