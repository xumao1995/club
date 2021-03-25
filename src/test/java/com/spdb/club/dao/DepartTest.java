package com.spdb.club.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import com.spdb.club.entity.Depart;
import com.spdb.club.utils.PageUtils;

import java.sql.SQLException;
import java.util.List;


/**
 * @ClassName DepartTest 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/20 23:43
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DepartTest {
    @Autowired
    private DepartDao departDao;

    @Test
    @Rollback
    public void insert() throws SQLException {
        Depart depart = new Depart("会员部","负责会籍管理");
        boolean flag = departDao.insert(depart);
        System.out.println("-----------------");
        System.out.println(flag);
        Assert.assertEquals(flag,true);
    }
    @Test
    @Commit
    public void update() throws SQLException {
        Depart depart = new Depart(11L,"宣传部","负责写推文");
        boolean flag = departDao.update(depart);
        System.out.println("-----------------");
        System.out.println(flag);
        Assert.assertEquals(flag,true);
    }

    @Test
    @Commit
    public void selectByPage() throws SQLException {
//        Depart depart = new Depart(11L,"宣传部","负责写推文");
        PageUtils pageUtils = new PageUtils(2,1);
        List<Depart> departs = departDao.selectByPage(pageUtils);
        System.out.println(departs);
        System.out.println("-----------------");
        pageUtils.randPage(3);
        List<Depart> departs2 = departDao.selectByPage(pageUtils);
        System.out.println(departs2);
        Assert.assertEquals(departs.size(),1);
    }

    @Test
    public void selectBySearch() throws SQLException {
        PageUtils pageUtils = new PageUtils(2,10);
        String key = "部";
        List<Depart> departs = departDao.selectBySearch(key,pageUtils);
        System.out.println(departs);
        Assert.assertEquals(departs.size(),2);
    }
}
