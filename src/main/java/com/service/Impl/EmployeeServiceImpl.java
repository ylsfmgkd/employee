package com.service.Impl;

import com.mapper.EmployeeMapper;
import com.pojo.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> queryAllEmployee(){
        return employeeMapper.queryAllEmployee();
    }

    @Override
    public Employee queryEmployeeByEid(String eid)
    {
        return employeeMapper.queryEmployeeByEid(eid);
    }

    @Override
    public boolean addEmployee(Employee employee)
    {
        int row = employeeMapper.addEmployee(employee);
        if (row>0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmployeeByEid(String eid)
    {
        int row = employeeMapper.deleteEmployeeByEid(eid);
        if (row>0)
        {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteEmpolyeeByEids(String[] eids) {
        int row = employeeMapper.deleteEmpolyeeByEids(eids);
        if (row>0)
        {
            return true;
        }
        return false;
    }



    @Override
    public boolean updateEmployee(Employee employee)
    {
        int row = employeeMapper.updateEmployee(employee);
        if (row>0)
        {
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> selectEmployeeByEname(String ename) {
        return employeeMapper.selectEmployeeByEname(ename);
    }
}
