package com.controller;

import com.pojo.Work;
import com.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("employee")
public class WorkController
{
    @Autowired
    WorkService workService;

    @RequestMapping("to_show_work")
    public String toShowWork()
    {
        return "employee/show_work";
    }

    @RequestMapping("/show_work")
    public String ShowWork(Model model)
    {
        List<Work> workList = workService.queryAllWork();
        model.addAttribute("works",workList);
        return "employee/worklist";
    }

    @RequestMapping("to_add_work")
    public String toAddWork()
    {
        return "employee/addwork";
    }

    @RequestMapping("/addwork")
    public String AddWork(Work work)
    {
        boolean flag = workService.addWork(work);
        if (flag)
        {
            return "redirect:show_work";
        }
        return "redirect:addwork";
    }

    @RequestMapping("to_update_work")
    public String toUpdate(String wid,Model model)
    {
        Work work = workService.queryWorkByWid(wid);
        model.addAttribute("work", work);
        return "employee/updatework";
    }

    @RequestMapping("/updatework")
    public String update(Work work){
        workService.updateWork(work);
        return "redirect:show_work";
    }


    @RequestMapping("/delete_work")
    public String DeleteWork(String wid)
    {
        boolean flag = workService.deleteWorkByWid(wid);
        if (flag)
        {
            return "redirect:show_work";
        }
        return "redirect:show_work";
    }

}
