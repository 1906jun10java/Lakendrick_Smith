--2 SQL Queries
--2.1 SELECT
--Task 1 – Select all records from the Employee table.
SELECT * FROM EMPLOYEE;

--Task 2 – Select all records from the Employee table where last name is King.
SELECT * FROM EMPLOYEE
WHERE LASTNAME= 'King';

--Task 3 – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
SELECT * FROM EMPLOYEE
WHERE FIRSTNAME= 'Andrew' AND REPORTSTO IS NULL;

--2.2 ORDER BY
--Task 1 – Select all albums in Album table and sort result set in descending order by title.
SELECT * FROM ALBUM ORDER BY TITLE DESC;

--Task 2 – Select first name from Customer and sort result set in ascending order by city
SELECT * FROM CUSTOMER
ORDER BY CITY,
        FIRSTNAME;
        
        
--2.4 UPDATE
--Task 1 – Update Aaron Mitchell in Customer table to Robert Walter
UPDATE CUSTOMER
SET FIRSTNAME = 'Robert', LASTNAME = 'Walter'
WHERE (FIRSTNAME = 'Aaron' AND LASTNAME = 'Mitchell');
COMMIT;

SELECT * FROM CUSTOMER;

--Task 2 – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR” 
UPDATE ARTIST
SET NAME = 'CCR'
WHERE NAME = 'Creedence Clearwater Revival';
COMMIT;

SELECT * FROM ARTIST
ORDER BY NAME;  

--2.5 LIKE
--Task 1 – Select all invoices with a billing address like “T%” 
SELECT * FROM INVOICE
WHERE BILLINGADDRESS LIKE 'T%';

--2.7 DELETE
--Task 2 – Delete a record in Customer table where the name is Robert Walter 
ALTER TABLE INVOICE
    DROP CONSTRAINT FK_INVOICECUSTOMERID;
    
ALTER TABLE INVOICE
    ADD CONSTRAINT FK_INVOICECUSTOMERID
    FOREIGN KEY (CUSTOMERID)
    REFERENCES CUSTOMER (CUSTOMERID)
    ON DELETE CASCADE;
ALTER TABLE INVOICELINE
    DROP CONSTRAINT FK_INVOICELINEINVOICEID;

ALTER TABLE INVOICELINE
    ADD CONSTRAINT FK_INVOICELINEINVOICEID
    FOREIGN KEY (INVOICEID)
    REFERENCES INVOICE (INVOICEID)
    ON DELETE CASCADE;
    
DELETE FROM CUSTOMER
WHERE FIRSTNAME = 'Robert' AND LASTNAME = 'Walter';
commit;





--3.2  Aggregate Functions
--Task 1 – returns the average total of all invoices 
SELECT AVG(ALL TOTAL)
FROM INVOICE;

--Task 2 – Create a function that returns the most expensive track

SELECT MAX(UNITPRICE) 

AS "MOST EXPENSIVE TRACK"

FROM TRACK;

--3.3 User Defined Scalar Functions
--Task 1 – Creates a function that returns the average price of invoice line items in the invoiceline table

SELECT AVG(ALL UNITPRICE)
FROM INVOICELINE;


-3.4 User Defined Table Valued Functions
--Task 2 – Create a function that returns all employees who are born after 1968.

SELECT * FROM EMPLOYEE
WHERE BIRTHDATE>= DATE '1969-01-01';

--4.0 Stored Procedures
 --In this section you will be creating and executing stored procedures. You will be creating various types of stored procedures that take input and output parameters.

--4.1 Basic Stored Procedure
--Task 1 – Create a stored procedure that selects the first and last names of all the employees.

 
 CREATE OR REPLACE PROCEDURE EMPLOYEE_FIRSTLASTNAME
 (FIRSTNAME OUT VARCHAR2, LASTNAME OUT VARCHAR2)
AS
BEGIN
    SELECT FIRSTNAME, LASTNAME 
    INTO FIRSTNAME, LASTNAME 
    FROM EMPLOYEE;
    
    END;
    
--4.1 Basic Stored Procedure
--Task 2 – Create a stored procedure that selects the first and last names of all the employees.

 
 CREATE OR REPLACE PROCEDURE EMPLOYEE_FIRSTLASTNAME
 (FIRSTNAME OUT VARCHAR2, LASTNAME OUT VARCHAR2)
AS
BEGIN
    SELECT FIRSTNAME, LASTNAME 
    INTO FIRSTNAME, LASTNAME 
    FROM EMPLOYEE;
    
    END;
    
UPDATE EMPLOYEE
    SET
    FIRSTNAME = FIRSTNAME2,
    LASTNAME = LASTNAME2,
    BIRTHDATE = BIRTHDATE2
    WHERE
    EMPLOYEEID = EMPLOYEEID2;
    
    END; 
    

--5.0 Transactions
-
 
 CREATE OR REPLACE PROCEDURE DELETE_INVOICE_GIVEN_INVOICEID
 
 (INVOICEID2 IN NUMBER)
 
 AS
 BEGIN
 DELETE
 
 FROM INVOICE
 WHERE INVOICEID = INVOICEID2;
 COMMIT;
 END;
 
 --6.1 AFTER/FOR
--Task 1 - Create an after insert trigger on the employee table fired after a new record is inserted into the table.

CREATE OR REPLACE TRIGGER  AFTER_INSERT_TRIGGER AFTER INSERT ON EMPLOYEE

FOR EACH ROW  
BEGIN 
UPDATE CUSTOMER
SET FIRSTNAME = 'Billy', LASTNAME = 'Albert'
WHERE (FIRSTNAME = 'Fat' AND LASTNAME = 'Albert');
END;


--Task 2 – Create an after update trigger on the album table that fires after a row is inserted in the table

CREATE OR REPLACE TRIGGER AFTER_UPDATE_TRIGGER AFTER UPDATE ON ALBUM
FOR EACH ROW
BEGIN
UPDATE ARTIST
SET NAME = 'Dallas Houston'
WHERE NAME = 'Trump';
END;

Task – Create an after delete trigger on the customer table that fires after a row is deleted from the table.

CREATE OR REPLACE TRIGGER AFTER_DELETE_TRIGGER AFTER DELETE ON CUSTOMER

FOR EACH ROW  
BEGIN 
DBMS_OUTPUT.PUT_LINE('row is destroyed');
END;

--Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.

SELECT  CUSTOMER.FIRSTNAME, CUSTOMER.LASTNAME, INVOICE.INVOICEID
   FROM CUSTOMER
   INNER JOIN INVOICE
   ON CUSTOMER.CUSTOMERID = INVOICE.CUSTOMERID;

    

        
    