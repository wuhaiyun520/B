package com.b;
import java.lang.*;
public class Student{
    private int age;
    private int id;
    private String name;
    private double score;
    public Student(){
        super();
    }

    public Student(int age, int id, String name, double score) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
