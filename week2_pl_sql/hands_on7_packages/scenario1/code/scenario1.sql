CREATE OR REPLACE PACKAGE CustomerManagement AS
  PROCEDURE AddCustomer(
    p_id NUMBER, p_name VARCHAR2, p_age NUMBER, p_dob DATE, p_balance NUMBER
  );
  
  PROCEDURE UpdateCustomer(
    p_id NUMBER, p_name VARCHAR2, p_age NUMBER
  );
  
  FUNCTION GetCustomerBalance(p_id NUMBER) RETURN NUMBER;
END CustomerManagement;
/
