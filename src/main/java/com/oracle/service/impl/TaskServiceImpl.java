package com.oracle.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.oracle.common.Compent;
import com.oracle.common.PageResult;
import com.oracle.mapper.TaskMapper;
import com.oracle.pojo.Task;
import com.oracle.pojo.TaskExample;
import com.oracle.service.TaskService;
import com.oracle.util.DateUtil;
import com.oracle.vo.TaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> findList() {
        List<Task> tasks = taskMapper.selectByExample(null);
        return tasks;
    }

    @Override
    public PageResult findPages(Integer pageNo, Integer pageSize, TaskVo taskVo) {
        //1、在查询数据库之前，在插件中封装页码
        PageHelper.startPage(pageNo,pageSize);

        //2、拼接查询
        TaskExample example = new TaskExample();
        TaskExample.Criteria criteria = example.createCriteria();

        if(!ObjectUtils.isEmpty(taskVo.getStartTime())){
            Date startDate = DateUtil.getDate(taskVo.getStartTime());
            criteria.andLauchtimeGreaterThan(startDate);
        }

        if(!ObjectUtils.isEmpty(taskVo.getEndTime())){
            Date endDate = DateUtil.getDate(taskVo.getEndTime());
            criteria.andLauchtimeLessThan(endDate);
        }

        if(!ObjectUtils.isEmpty(taskVo.getTypeid())){
            criteria.andTypeidEqualTo(taskVo.getTypeid());
        }

        if(!ObjectUtils.isEmpty(taskVo.getState())){
            criteria.andStateEqualTo(taskVo.getState());
        }

       // criteria.andIsdeleteEqualTo(Compent.not_delete);

        //2、执行查询
        Page<Task> taskPage = (Page<Task>)taskMapper.selectByExample(example);
        return new PageResult(taskPage.getTotal(),taskPage.getResult());
    }
}



