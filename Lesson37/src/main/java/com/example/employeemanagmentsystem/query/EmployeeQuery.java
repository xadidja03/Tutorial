package com.example.employeemanagmentsystem.query;
public class EmployeeQuery {
    public final static String INSERT_EMPLOYEES = "INSERT INTO employee (name, department, salary) VALUES (:name, :department, :salary );";

    public final static String FIND_EMPLOYEES = "select * from employee ";

    public final static String UPDATE_EMPLOYEES = "update employee set name = :name , department= :department, salary= :salary";

    public final static String DELETE_EMPLOYEES = "delete from employee  where id = :id ";

    public final static String FIND_BY_ID = "select * from employee where id = :id ";
}
