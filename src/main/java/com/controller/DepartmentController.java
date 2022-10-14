package com.controller;


import com.pojo.Department;
import com.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("employee")
public class DepartmentController
{
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("to_show_department")
    public String toqueryAllDepartment()
    {
        return "employee/show_department";
    }

    @RequestMapping("/show_department")
    public String queryAllDepartment(Model model)
    {
        List<Department> departmentList = departmentService.queryAllDepartment();
        model.addAttribute("departments",departmentList);
        return "employee/deplist";
    }

    @RequestMapping("to_add_department")
    public String add()
    {
        return "employee/adddep";
    }

    @RequestMapping("/adddep")
    public String add(Department department)
    {
        boolean flag = departmentService.addDepartment(department);
        if (flag)
        {
            return "redirect:show_department";
        }
        return "redirect:employee/adddep";
    }

    @RequestMapping("/delete_department")
    public String delete(String did)
    {
        boolean flag = departmentService.deleteDepartmentByDid(did);
        if (flag)
        {
            return "redirect:show_department";
        }
        return "redirect:show_department";
    }
}
