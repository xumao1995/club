package com.spdb.club.entity;

public enum Status {
//    活动状态
    WRITING_PUBLISH(10,"草稿箱"),
    PUBLISHED(11,"已发布"),
    HOLD(12,"已举办"),
    DELAY(13,"延期"),
    CANCELED(14,"已取消"),

//    比赛胜负
    WINNER(20,"胜"),
    LOSER(21,"负")
    ;

    private final int key;
    private final String value;

    Status(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Status{" +
                "key=" + key +
                ", value='" + value + '\'' +
                "} " + super.toString();
    }
}
