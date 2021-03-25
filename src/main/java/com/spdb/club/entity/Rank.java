package com.spdb.club.entity;

/**
 * @EnumName Rank 类
 * @Description 等级类，根据积分划分等级
 * @Author 许茂
 * @Date 2021/3/21 13:25
 * @Version 1.0
 */
public enum Rank {
    WU_YU_LUN_BI(6000,"无羽伦比",""),
    SHUI_YU_ZHENG_FENG(5000,"谁羽争锋",""),
    QING_YU_FEI_YANG(4000,"轻羽飞扬",""),
    YU_YI_WEI_FENG(3000,"羽翼未丰",""),
    YU_BU_JING_REN(2000,"羽不惊人",""),
    YU_SHI_WU_ZHENG(1000,"羽世无争",""),
    YU_SHI_GE_JUE(0,"羽世隔绝","");

    private final int points;
    private final String name;
    private final String desc;
    Rank(int points, String name,  String desc) {
        this.points = points;
        this.name = name;
        this.desc = desc;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "points=" + points +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                "} " + super.toString();
    }

}

