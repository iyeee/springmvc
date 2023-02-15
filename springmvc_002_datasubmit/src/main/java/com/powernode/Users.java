package com.powernode;

public class Users {
        private String name;


        private Integer age;

    public Users(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
