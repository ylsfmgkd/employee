package com.service.Impl;

import com.mapper.WorkMapper;
import com.pojo.Employee;
import com.pojo.Work;
import com.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WorkServiceImpl implements WorkService
{
    @Autowired
    WorkMapper workMapper;

    @Override
    public Work queryWorkByWid(String wid)
    {
        return workMapper.queryWorkByWid(wid);
    }


    @Override
    public boolean addWork(Work work) {
        int row = workMapper.addWork(work);
        if (row>0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteWorkByWid(String wid) {
        int row = workMapper.deleteWorkByWid(wid);
        if (row>0)
        {
            return true;
        }
        return false;
    }

    @Override
    public List<Work> queryAllWork() {
        return workMapper.queryAllWork();
    }

    @Override
    public boolean updateWork(Work work)
    {
        int row = workMapper.updateWork(work);
        if (row>0)
        {
            return true;
        }
        return false;
    }
}
