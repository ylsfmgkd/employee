package com.mapper;

import com.pojo.Employee;
import com.pojo.Work;

import java.util.List;

public interface WorkMapper
{
    int addWork(Work work);

    int deleteWorkByWid(String wid);

    int updateWork(Work work);

    List<Work> queryAllWork();

    Work queryWorkByWid(String wid);
}
