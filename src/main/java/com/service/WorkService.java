package com.service;

import com.pojo.Employee;
import com.pojo.Work;

import java.util.List;

public interface WorkService
{
    public boolean addWork(Work work);

    public boolean deleteWorkByWid(String wid);

    public List<Work> queryAllWork();

    public boolean updateWork(Work work);

    public Work queryWorkByWid(String wid);
}
