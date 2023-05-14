package com.Extend_;

public class Base {
    public int n1=100;
    protected int n2=200;
    private int n3=300;

    int n4=400;

    public Base(){ //无参构造器，构造器的名字要和类名相同
        System.out.println("Base是一个构造器");
    }
    public void test01(){
        System.out.println("test100");
    }
    protected void test02(){
        System.out.println("test200");
    }
    public int  getN4(){   //在父类里面定义一个公共的方法访问私有属性n4
        return n4;
    }
    private void test03(){
        System.out.println("test300");
    }
    void test04(){
        System.out.println("test400");
    }
}

