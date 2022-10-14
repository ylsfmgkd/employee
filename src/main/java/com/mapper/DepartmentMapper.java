package com.mapper;

import com.pojo.Department;

import java.util.List;

public interface DepartmentMapper
{
    int addDepartment(Department department);

    int deleteDepartmentByDid(String did);

    List<Department> queryAllDepartment();
}
