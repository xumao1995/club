package com.spdb.club.controller;

import com.spdb.club.entity.Depart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spdb.club.service.IDepartService;
import com.spdb.club.utils.PageUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName DepartController 类
 * @Description TODO
 * @Author 许茂
 * @Date 2021/3/20 16:35
 * @Version 1.0
 */
@RestController
public class DepartController {
    @Resource
    private IDepartService departService;

    @GetMapping("/departs/{name}")
    public List<Depart> getBySearch(@PathVariable("name")String name, @RequestParam("page") PageUtils page){
        List<Depart> departs = departService.getBySearch(name,page);
        return departs;
    }
    @GetMapping("/departs/{id}")
    public Depart getOne(@PathVariable("id") long id){
        Depart depart = departService.getOne(id);
        return depart;
    }


}
