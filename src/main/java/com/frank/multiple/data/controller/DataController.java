package com.frank.multiple.data.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-multiple-data
 * @package: com.frank.multiple.data.controller、
 * @email: cy880708@163.com
 * @date: 2019/5/14 下午3:38
 * @mofified By:
 */
@Controller
@RequestMapping(value = "/user")
public class DataController {

    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(){
        return 1;
    }
}
