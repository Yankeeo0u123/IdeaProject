//package com.cellection_;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//
//public class CollectionExercise {
//    public static void main(String args[]){
//
//        //数据都是存放在队列里的，这个队列叫做col集合
//        Collection col=new ArrayList();
//        col.add(new Dog("小白",1));
//        col.add(new Dog("小花",2));
//        col.add(new Dog("小黑",3));
//        System.out.println(col);
//
//        //然后为了遍历这个col集合，应用迭代器
//        //先创建一个迭代器
////        Iterator iterator=col.iterator();
////        //用while循环判断下一个是否为空
////        while(iterator.hasNext()){
////            Object obj = iterator.next();
////            //返回下一个元素，类型是Object
////             System.out.println(obj);
////        }
//        //然后是使用增强for循环
//       //如果括号是col,遍历就没有意义了
//        for(Object Dog:col){
//            System.out.println(Dog);
//
//        }
//    }
//}
//class Dog{
//    private String name;
//    private int age;
//
//    @Override
//    public String toString() {
//        return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Dog(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
