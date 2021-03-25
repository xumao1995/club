package com.spdb.club.service.impl;

import org.springframework.stereotype.Service;
import com.spdb.club.dao.DepartDao;
import com.spdb.club.entity.Depart;
import com.spdb.club.service.IDepartService;
import com.spdb.club.utils.PageUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DepartService 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/20 23:09
 * @Version 1.0
 */
@Service
public class DepartService implements IDepartService {
    @Resource
    private DepartDao departDao;

    @Override
    public boolean add(Depart depart) {
        boolean flag = departDao.insert(depart);
        return flag;
    }

    @Override
    public boolean edit(Depart depart) {
        return departDao.update(depart);
    }

    @Override
    public boolean delete(long id) {
        return departDao.delete(id);
    }

    @Override
    public List<Depart> getAll() {
        return departDao.selectAll();
    }

    @Override
    public List<Depart> getAll(PageUtils pageUtils) {
        return departDao.selectByPage(pageUtils);
    }

    @Override
    public Depart getOne(long id) {
        return departDao.selectOne(id);
    }

    @Override
    public List<Depart> getBySearch(String name, PageUtils pageUtils) {
        return departDao.selectBySearch(name,pageUtils);
    }
}
