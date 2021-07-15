package com.hp.day08;

import java.util.Objects;

public class StaffInfo {
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffInfo staffInfo = (StaffInfo) o;
        return age == staffInfo.age &&
                salary == staffInfo.salary &&
                Objects.equals(name, staffInfo.name) &&
                Objects.equals(sex, staffInfo.sex) &&
                Objects.equals(hiredate, staffInfo.hiredate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, salary, hiredate);
    }

    public StaffInfo(String name, int age, String sex, int salary, String hiredate) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "StaffInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", salary=" + salary +
                ", hiredate='" + hiredate + '\'' +
                '}';
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    private int age;
    private String sex;
    private int salary;
    private  String hiredate;
}
