package com.spdb.club.controller;

import com.spdb.club.entity.Depart;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
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
/*
* @Api：用在请求的类上，表示对类的说明
    tags="说明该类的作用，可以在UI界面上看到的注解"
    value="该参数没什么意义，在UI界面上也看到，所以不需要配置"


@ApiOperation：用在请求的方法上，说明方法的用途、作用
    value="说明方法的用途、作用"
    notes="方法的备注说明"


@ApiImplicitParams：用在请求的方法上，表示一组参数说明
    @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面
        name：参数名
        value：参数的汉字说明、解释
        required：参数是否必须传
        paramType：参数放在哪个地方
            · header --> 请求参数的获取：@RequestHeader
            · query --> 请求参数的获取：@RequestParam
            · path（用于restful接口）--> 请求参数的获取：@PathVariable
            · body（不常用）
            · form（不常用）
        dataType：参数类型，默认String，其它值dataType="Integer"
        defaultValue：参数的默认值


@ApiResponses：用在请求的方法上，表示一组响应
    @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息
        code：数字，例如400
        message：信息，例如"请求参数没填好"
        response：抛出异常的类


@ApiModel：用于响应类上，表示一个返回响应数据的信息
            （这种一般用在post创建的时候，使用@RequestBody这样的场景，
            请求参数无法使用@ApiImplicitParam注解进行描述的时候）

*
* */
@Api(value = "部门模块", tags = "部门信息API")
@RestController
public class DepartController {
    @Resource
    private IDepartService departService;

    @ApiImplicitParams({@ApiImplicitParam(name = "部门名",value = ""),})
    @GetMapping("/departs/search/{name}")
    public List<Depart> getBySearch(@PathVariable("name")String name, @RequestParam("page") PageUtils page){
        List<Depart> departs = departService.getBySearch(name,page);
        return departs;
    }
    @ApiOperation(value = "根据id获取部门信息",notes = "根据部门id获取具体的部门信息")
    @ApiImplicitParam(value = "部门ID",paramType = "path")
    @GetMapping("/departs/{id}")
    public Depart getOne(@PathVariable("id") long id){
        Depart depart = departService.getOne(id);
        return depart;
    }
    @ApiOperation(value = "获取部门列表",notes = "获取所有的部门信息")
    @GetMapping("/departs")
    public List<Depart> getAll(){
        List<Depart> departs = departService.getAll();
        return departs;
    }

}
