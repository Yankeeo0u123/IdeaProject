package com.cellection_;

import java.util.ArrayList;
import java.util.Iterator;


public class CollectionExercise01 {
    public static void main(String args[]){
        ArrayList list =new ArrayList();
        list.add(new Dog("小白",1));
        list.add(new Dog("小花",2));
        System.out.println(list);
        //先用for增强
//        for(Object Dog:list){
//            System.out.println(Dog);
//        }
        //完成
        //现在使用while进行循环
        //首先定义迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object Dog=iterator.next();
            System.out.println(Dog);

        }
    }
}
class Dog{
    private String name;
    private int  age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Dog{" +
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
