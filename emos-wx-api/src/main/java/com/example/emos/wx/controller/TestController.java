package com.example.emos.wx.controller;
import com.example.emos.wx.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//类中的所有web方法接受和返回的数据都是json格式的
@RequestMapping("/test")
//分配相对路径
@Api("测试Web接口")
//给类加注解
public class TestController {
    @GetMapping("/sayHello")
    //get请求分配相对路径
    @ApiOperation("最简单的测试方法")
    //加注解 可显示到swagger页面
    public R sayHello(){
        return R.ok().put("message","HelloWorld");
        //创建R对象，调用ok方法，绑定业务数据message，返回值HelloWorld
    }
}