package com.oracle.service;

import com.oracle.common.PageResult;
import com.oracle.pojo.Task;
import com.oracle.vo.TaskVo;

import java.util.List;

public interface TaskService {

    public List<Task> findList();
    public PageResult findPages(Integer pageNo, Integer pageSize, TaskVo taskVo);

}
