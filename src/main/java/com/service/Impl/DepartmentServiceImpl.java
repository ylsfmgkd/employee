package com.service.Impl;


import com.mapper.DepartmentMapper;
import com.pojo.Department;
import com.pojo.Employee;
import com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService
{
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> queryAllDepartment(){
        return departmentMapper.queryAllDepartment();
    }
    @Override
    public boolean addDepartment(Department department) {
        int row = departmentMapper.addDepartment(department);
        if (row>0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteDepartmentByDid(String did) {
        int row = departmentMapper.deleteDepartmentByDid(did);
        if (row>0) {
            return true;
        }
        return false;
    }
}
