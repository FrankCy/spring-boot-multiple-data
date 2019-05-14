package com.frank.multiple.data.pojo;

import java.io.Serializable;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: spring-boot-multiple-data
 * @package: com.frank.multiple.data.pojo、
 * @email: cy880708@163.com
 * @date: 2019/5/14 下午3:35
 * @mofified By:
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6777048592520161323L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
