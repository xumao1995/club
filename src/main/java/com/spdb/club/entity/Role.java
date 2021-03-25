package com.spdb.club.entity;

import java.util.List;

/**
 * @ClassName Role 类
 * @Description 角色类
 * @Author 许茂
 * @Date 2021/3/21 14:34
 * @Version 1.0
 */
public class Role {
    private long id;
    private String name;
    private String description;
    private List<Promise> promises;
    private List<User> users;
    public Role(){}

    public Role(String name, String description) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Promise> getPromises() {
        return promises;
    }

    public void setPromises(List<Promise> promises) {
        this.promises = promises;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", promises=" + promises +
                ", users=" + users +
                '}';
    }
}
