package com.example.demo;

import com.example.demo.mq.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MQTest {

    @Autowired
    private MsgProducer msgProducer;

    @Test
    public void contextLoads() {
        msgProducer.sendMsg("测试A" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

}
