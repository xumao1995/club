package com.spdb.club.entity;

import java.util.List;

/**
 * @ClassName Promise 类
 * @Description 权限类，对应按钮和链接
 * @Author 许茂
 * @Date 2021/3/21 14:33
 * @Version 1.0
 */
public class Promise {
    private long id;
    private String name;
    private String url;
    private String description;
    private List<Role> roles;

    public Promise(){}

    public Promise(String name, String url, String description) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Promise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                ", roles=" + roles +
                '}';
    }
}
