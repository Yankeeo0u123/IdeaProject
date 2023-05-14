package com.hspedu.static_;

public class ChildGame {
    public static void main(String[]args){
        //定义一个变量，统计有多少小孩加入游戏

        Child child1=new Child("白骨精");
        child1.join();
        child1.count++;
        System.out.println("child1.count的值为"+child1.count);
        Child child2=new Child("蜘蛛精");
        child2.join();
        child2.count++;
        System.out.println("共有"+Child.count+"个小孩加入游戏");
        System.out.println("child1.count的值为"+child1.count);
        System.out.println("child2.count的值为"+child2.count);
        Child child3=new Child("黄瓜精");
        child3.join();
        child3.count++;
        //类变量直接通过类就能访问
        System.out.println("共有"+Child.count+"个小孩加入游戏");
        System.out.println("child1.count的值为"+child1.count);
        System.out.println("child2.count的值为"+child2.count);
        System.out.println("child3.count的值为"+child3.count);

    }
}
class Child{
    private String name;
    public static int count;

    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+"加入了游戏");
    }
}
