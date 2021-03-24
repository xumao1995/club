package com.spdb.club.entity;

public enum Gender {
    MAN(0,"男"),
    WOMAN(1,"女");

    private final int key;
    private final String value;

    Gender(int key, String value) {
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
        return "Gender{" +
                "key=" + key +
                ", value='" + value + '\'' +
                "} " + super.toString();
    }
}
