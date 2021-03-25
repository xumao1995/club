package com.spdb.club.service;

import com.spdb.club.entity.Depart;
import com.spdb.club.utils.PageUtils;

import java.util.List;

public interface IDepartService {
    /**
     * 插入部门信息
     * @param depart
     * @return
     */
    boolean add(Depart depart);

    /**
     * 编辑部门信息
     * @param depart
     * @return
     */
    boolean edit(Depart depart);

    /**
     * 删除部门信息
     * @param id
     * @return
     */
    boolean delete(long id);

    /**
     * 查询所有部门信息
     * @return
     */
    List<Depart> getAll();

    /**
     * 通过分页查询部门信息
     * @param pageUtils
     * @return
     */
    List<Depart> getAll(PageUtils pageUtils);

    /**
     * 通过指定id查询部门信息
     * @param id
     * @return
     */
    Depart getOne(long id);

    /**
     * 通过关键字搜索查询部门信息
     * @param name
     * @param pageUtils
     * @return
     */
    List<Depart> getBySearch(String name, PageUtils pageUtils);

}
