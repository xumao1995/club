package com.spdb.club.entity;

/**
 * @ClassName Depart 类
 * @Description 部门类
 * @Author 许茂
 * @Date 2021/3/20 16:23
 * @Version 1.0
 */

public class Depart {
    private Long id;
    private String name;
    private String description;

    public Depart() {
    }

    public Depart(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Depart(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Depart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
