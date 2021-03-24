package com.spdb.club.entity;

import java.util.List;

/**
 * @ClassName CompetitionRecord 类
 * @Description 比赛记录
 * @Author 许茂
 * @Date 2021/3/21 22:18
 * @Version 1.0
 */
public class CompetitionRecord {
    private long id;
//    己方，单打则为个人，双打则包括队友
    private List<User> selves;
//    地方
    private List<User> enemies;
//    双发约定比赛分数
    private int points;
//    胜-20、败-21 标志
    private Status status;

    public CompetitionRecord() {
    }

    public CompetitionRecord(long id, List<User> selves, List<User> enemies, int points, Status status) {
        this.id = id;
        this.selves = selves;
        this.enemies = enemies;
        this.points = points;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<User> getSelves() {
        return selves;
    }

    public void setSelves(List<User> selves) {
        this.selves = selves;
    }

    public List<User> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<User> enemies) {
        this.enemies = enemies;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CompetitionRecord{" +
                "id=" + id +
                ", selves=" + selves +
                ", enemies=" + enemies +
                ", points=" + points +
                ", status=" + status +
                '}';
    }
}
