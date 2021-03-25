package com.spdb.club.controller;

import com.spdb.club.entity.Depart;
import com.spdb.club.service.IDepartService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @ClassName DepartController 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/24 21:19
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartController {
    @Autowired
    private IDepartService departService;
    @Test
    public void getOne(){
        Long id = new Long(1);
        Depart depart = departService.getOne(id);
        System.out.println(depart);
    }

}
