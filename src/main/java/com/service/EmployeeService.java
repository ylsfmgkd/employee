package com.service;

import com.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> queryAllEmployee();

    public boolean addEmployee(Employee employee);

    public Employee queryEmployeeByEid(String eid);

    public boolean updateEmployee(Employee employee);

    public boolean deleteEmployeeByEid(String eid);

    public boolean deleteEmpolyeeByEids(String[] eids);

    public List<Employee> selectEmployeeByEname(String ename);

}
