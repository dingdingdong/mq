package com.htdf.ma.mq.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htdf.ma.mq.mapper.QuartzTaskMapper;
import com.htdf.ma.mq.pojo.QuartzTask;
/**
 * 
 * @ClassName: TaskController 
 * @Description: 任务控制器
 * @author: mengxn
 * @date: 2017年8月11日 下午1:21:29
 */
@RestController
@RequestMapping("task")
public class TaskController {
	
	@Resource
	private QuartzTaskMapper mapper;
	
	/**
	 * 
	 * @Title: quartzTask 
	 * @Description: 新增调度任务
	 * @return: void
	 */
	@PostMapping
	public void PosTask(@RequestBody List<QuartzTask> qts){
		mapper.insertBatch(qts);
	}
	
	/**
	 * 
	 * @Title: DelQuartzTask 
	 * @Description: 删除调度任务
	 * @param id
	 * @return: void
	 */
	@DeleteMapping
	public void DelTask(@RequestBody List<QuartzTask> qts){
		mapper.deleteBatch(qts);
	}
	
	/**
	 * 
	 * @Title: UpdQuartzTask 
	 * @Description: 修改调度任务
	 * @param id
	 * @return: void
	 */
	@PutMapping
	public void UpdTask(@RequestBody List<QuartzTask> qts){
		mapper.updateBatch(qts);
	}
	
	/**
	 * 
	 * @Title: GetTask 
	 * @Description: 查询调度任务
	 * @return
	 * @return: List<QuartzTask>
	 */
	@GetMapping
	public List<QuartzTask> GetTask(){
		return mapper.getAll();
	}
	
	
}
