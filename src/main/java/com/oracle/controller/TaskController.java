package com.oracle.controller;

import com.oracle.common.PageResult;
import com.oracle.common.R;
import com.oracle.pojo.Task;
import com.oracle.service.TaskService;
import com.oracle.vo.TaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

//    @GetMapping("/findList")
//    public R<Task> findList(){
//        List<Task> list = taskService.findList();
//        return R.success(list);
//    }

//    @GetMapping("/findPages")
//    public R<Task> findPages(Integer pageNo,Integer pageSize){
//
//        //增强项目的安全性
//        //健壮性
//        if(ObjectUtils.isEmpty(pageNo)){
//            pageNo = 1;
//        }
//
//        if(ObjectUtils.isEmpty(pageSize)){
//            pageSize = 10;
//        }
//
//        PageResult pages = taskService.findPages(pageNo, pageSize);
//        return R.success(pages);
//    }

    @PostMapping("/findPages")
    public R<Task> findPages2(@RequestBody TaskVo taskVo, Integer pageNo, Integer pageSize){

        //增强项目的安全性
        //健壮性
        if(ObjectUtils.isEmpty(pageNo)){
            pageNo = 1;
        }

        if(ObjectUtils.isEmpty(pageSize)){
            pageSize = 10;
        }

        PageResult pages = taskService.findPages(pageNo, pageSize,taskVo);
        return R.success(pages);
    }

}
