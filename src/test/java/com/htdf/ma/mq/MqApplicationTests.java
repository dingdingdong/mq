package com.htdf.ma.mq;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.htdf.ma.mq.mapper.QuartzTaskMapper;
import com.htdf.ma.mq.pojo.QuartzTask;
import com.htdf.ma.mq.producer.ProducerA;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqApplicationTests {
	
	@Resource
	private ProducerA p;
	
	@Resource
	private QuartzTaskMapper mapper;

	@Test
	public void contextLoads() {
		//Destination destination = new ActiveMQTopic("msg.topic");
		//p.sendMessage(destination, "A");
		QuartzTask qt = new QuartzTask();
		qt.setOnoff("ON");
		qt.setId(19l);
		mapper.update(qt);
		//qt.setTask_key("asm");
		//qt.setTrigger_key("asm");
		//qt.setGroup_key("asm");
		//qt.setMessage("asm");
		//qt.setCron("*****");
		//qt.setId(1l);
		//List<QuartzTask> s = new ArrayList<QuartzTask>();
		//s.add(qt);
		//mapper.insertBatch(s);
		//mapper.getAll();
		//mapper.update(qt);
		//mapper.delete(1l);
	}

}
