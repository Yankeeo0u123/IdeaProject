package com.hspedu.codeblock;

public class CodeBlock01 {
    public static void main(String[]args){
        Movie movie=new Movie("你的名字");
        Movie movie2=new Movie("你的名字",20);
        Movie movie3=new Movie("你的名字",20,"日本");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    //构造器
    public Movie(String name) {
        this.name = name;
        System.out.println("第一个构造器被调用");
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println("第二个构造器被调用");
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("第三个构造器被调用");
    }
    {
        System.out.println("电影屏幕打开");
        System.out.println("出现广告");
        System.out.println("电影正式开始");
    }
}

