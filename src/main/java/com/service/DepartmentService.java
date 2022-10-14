package com.service;

import com.pojo.Department;

import java.util.List;

public interface DepartmentService
{
    public boolean addDepartment(Department department);

    public boolean deleteDepartmentByDid(String did);

    public List<Department> queryAllDepartment();
}
