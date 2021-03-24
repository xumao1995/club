package com.spdb.club.entity;

import java.util.Date;
import java.util.List;

/**
 * @ClassName Activities 类
 * @Description 活动类
 * @Author 许茂
 * @Date 2021/3/21 20:51
 * @Version 1.0
 */
public class Activities {
    private long id;
    private String name;
    private String description;
//    举办方
    private String organizer;
//    负责人
    private User leader;
//    联系人
    private List<User> concat;
    private String address;
//    计划时间，非延期时即为实际举办活动
    private Date planTime;
//    延期时间，状态为延期时必填
    private Date delayTime;
    private Status status;
//    取消原因，状态为取消时必填
    private String reason;
//    报名人数
    private List<User> signUpList;
//    参加（签到）人数
    private List<User> signInList;
}
