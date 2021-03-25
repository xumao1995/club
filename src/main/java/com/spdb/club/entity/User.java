package com.spdb.club.entity;

import java.util.List;

/**
 * @ClassName User 类
 * @Description 会员类
 * @Author 许茂
 * @Date 2021/3/20 18:06
 * @Version 1.0
 */
public class User {
    private long id;
    private String no;
    private String name;
    private String nickName;
    private String password;
    private String phone;
    private String email;
//    加入羽毛球俱乐部时的想法
    private String idea;
//    积分
    private int points;
    private Gender gender;
    private Rank rank;
    private Depart depart;
    private List<Role> roles;
}
