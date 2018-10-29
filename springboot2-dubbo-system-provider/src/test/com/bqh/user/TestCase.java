package com.bqh.user;


import com.bqh.system.SpringbootDemoApplication;
import com.bqh.system.domain.SysDept;
import com.bqh.system.service.SysDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author boqh
 * @Description
 * @date 2018-10-19 16:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class TestCase {

    // UserService中依赖了CreditSystemService，但是CreditSystemService没有实现类
    @Autowired
    private SysDeptService sysDeptService;


    @Test
    public void getCredit() throws Exception {

        System.out.println("-------------"+sysDeptService.selectDeptList(new SysDept()).size());

    }
}