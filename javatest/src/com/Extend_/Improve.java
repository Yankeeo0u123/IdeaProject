package com.Extend_;

public class Improve {
    public String name;
    public int age;
    private int score;

    public void setScore(int score) {
        this.score = score;
    }
    public void Info(){
        System.out.println("姓名为"+name+"的年龄是"+age+"他的分数是"+score);
    }
}

