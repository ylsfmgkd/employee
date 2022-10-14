package com.controller;


import com.pojo.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("to_listpage")
    public String toListPage()
    {
        return "employee/listpage";
    }


    @RequestMapping("/listpage")
    public String queryAllEmployees(Model model)
    {
        List<Employee> employeeList = employeeService.queryAllEmployee();
        model.addAttribute("employees",employeeList);
        return "employee/emplist";
    }

    @RequestMapping("to_add")
    public String toadd()
    {
        return "employee/add";
    }

    @RequestMapping("/add")
    public String add(Employee employee)
    {
        boolean flag = employeeService.addEmployee(employee);
        if (flag)
        {
            return "redirect:listpage";
        }
        return "redirect:employee/add";
    }

    @RequestMapping("/delete")
    public String delete(String eid)
    {
        boolean flag = employeeService.deleteEmployeeByEid(eid);
        if (flag)
        {
            return "redirect:listpage";
        }
        return "redirect:listpage";
    }

    @RequestMapping("/deletes")
    @ResponseBody
    public String deleteEmployees(String eids)
    {
        String[] eidArray = eids.split(",");
        boolean flag = employeeService.deleteEmpolyeeByEids(eidArray);
        if (flag)
        {
            return "redirect:listpage";
        }
        return "redirect:listpage";
    }

    @RequestMapping("to_update")
    public String toUpdate(String eid,Model model)
    {
        Employee employee = employeeService.queryEmployeeByEid(eid);
        model.addAttribute("employee", employee);
        return "employee/update";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:listpage";
    }


    @RequestMapping("to_select")
    public String toselect()
    {
        return "employee/selectemp";
    }


    @RequestMapping("/selectemp")
    public String queryEmployeeByName(String ename, Model model){
        if (ename!=null && !ename.equals("")){
            List<Employee> employeeList = employeeService.selectEmployeeByEname(ename);
            model.addAttribute("employees",employeeList);
            return "employee/selectemp";
        }
        model.addAttribute("error","未查询到响应的数据，请您检查输入的数据名称是否正确~");
        System.err.println("error");
        return "redirect:to_selectemp";
    }

}
