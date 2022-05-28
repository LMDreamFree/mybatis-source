package com.dream.singleton.mybatis.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author <a href = "mailto:lmdreamfree@163.com">lim</a>
 * @date 2022/5/25 21:56
 * @className User
 */
public class User implements Serializable {

    private long id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别 性别 1:男;2:女
     */
    private int gender;
    /**
     * 体重 单位:克
     */
    private int weight;

    private List<String> hobbies;


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public List<String> getHobbies() {
        return hobbies;
    }


    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", weight=" + weight +
                ", hobbies=" + hobbies +
                '}';
    }
}
