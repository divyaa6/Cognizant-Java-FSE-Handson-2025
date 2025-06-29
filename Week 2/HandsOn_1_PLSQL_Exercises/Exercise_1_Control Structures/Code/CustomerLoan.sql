create table customers(
customerID number primary key,
name varchar(50),
age number,
balance number(10,2),
intrestRate number(4,2),
IsVIP varchar(5) default 'FALSE'
);

create table loan(
loanID number primary key,
customerID number,
dueDate DATE,
amount number(10,2),
foreign key(customerID) references customers(customerID)
);

insert into customers values(1,'Divya',68,1800,6.3,'FALSE');
insert into customers values(2, 'Sid',45,10000,5.5,'TRUE');
insert into customers values(3,'Dev',70,20000,9.8,'FALSE');

insert into loan values(101,1,SYSDATE+5,5000);
insert into loan values(102,2,SYSDATE+15,7000);
insert into loan values(103,3,SYSDATE+3,6000);

SET SERVEROUTPUT ON;
BEGIN
  FOR rec IN (SELECT customerID,intrestRate FROM customers WHERE age > 60) LOOP
    UPDATE customers
    SET intrestRate = intrestRate*0.99
    WHERE customerID = rec.customerID;

    DBMS_OUTPUT.PUT_LINE('Updated CustomerID: '||rec.CustomerID);
  END LOOP;
  COMMIT;
END;

BEGIN
  FOR rec IN (SELECT customerID,balance FROM customers WHERE balance > 10000) LOOP
    UPDATE customers
    SET IsVIP = 'TRUE'
    WHERE customerID = rec.customerID;

    DBMS_OUTPUT.PUT_LINE('Customer '||rec.CustomerID ||' promoted to VIP. Balance: $'|| rec.Balance);
  END LOOP;
  COMMIT;
END;


BEGIN
  FOR rec IN(
    SELECT L.LoanID, L.customerID, L.dueDate, C.name
    FROM Loan L
    JOIN customers C ON L.customerID = C.customerID
    WHERE L.dueDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Customer '|| rec.Name|| ' (ID: ' || rec.CustomerID|| ') has Loan '|| rec.LoanID || ' due on ' || TO_CHAR(rec.DueDate, 'DD-Mon-YYYY'));
  END LOOP;
END;


select * from customers;
select * from loan;

