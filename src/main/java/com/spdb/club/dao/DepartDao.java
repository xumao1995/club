package com.spdb.club.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.spdb.club.entity.Depart;
import com.spdb.club.utils.PageUtils;

import java.util.List;

/**
 * @ClassName DepartDao 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/20 16:21
 * @Version 1.0
 */
@Repository
public interface DepartDao {

    boolean insert(Depart depart);

    boolean update(Depart depart);

    boolean delete(long id);

    List<Depart> selectAll();

    List<Depart> selectByPage(PageUtils pageUtils);

    Depart selectOne(long id);

    List<Depart> selectBySearch(@Param("name") String name, @Param("pageUtils") PageUtils pageUtils);
}
