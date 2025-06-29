CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Balance NUMBER,
    AccountType VARCHAR2(20)
);

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Department VARCHAR2(30),
    Salary NUMBER
);

INSERT INTO Accounts VALUES (101, 'Arun', 20000, 'Savings');
INSERT INTO Accounts VALUES (102, 'Lakshmi', 15000, 'Savings');
INSERT INTO Accounts VALUES (103, 'Meena', 18000, 'Savings');

INSERT INTO Employees VALUES (201, 'Karthik', 'Finance', 45000);
INSERT INTO Employees VALUES (202, 'Revathi', 'Finance', 47000);
INSERT INTO Employees VALUES (203, 'Divya', 'HR', 42000);

SELECT * from Accounts;
select * from Employees;

SET SERVEROUTPUT ON;


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percent IN NUMBER
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;
    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_percent || '% applied to employees in department: ' || p_department);
END;
/

BEGIN
    UpdateEmployeeBonus('Finance', 10);
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_account;
    IF v_balance < p_amount THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient funds in source account.');
    ELSE
        UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_from_account;
        UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_to_account;
        DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_from_account || ' to Account ' || p_to_account);
    END IF;
END;
/

BEGIN
    TransferFunds(101, 102, 500);
END;
/

