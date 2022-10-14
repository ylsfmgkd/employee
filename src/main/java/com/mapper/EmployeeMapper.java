package com.mapper;

import com.pojo.Employee;

import java.util.List;

public interface EmployeeMapper
{
    List<Employee> queryAllEmployee();

    int addEmployee(Employee employee);

    int updateEmployee(Employee employee);

    int deleteEmployeeByEid(String eid);

    int deleteEmpolyeeByEids(String[] eids);

    Employee queryEmployeeByEid(String eid);

    List<Employee> selectEmployeeByEname(String ename);
}
