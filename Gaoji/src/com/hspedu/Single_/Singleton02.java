package com.hspedu.Single_;

public class Singleton02 {
    public static void main(String args[]){
        BoyFriend instance = BoyFriend.getInstance();
        System.out.println(instance);

    }
}
class BoyFriend{
    private int age;

    private  BoyFriend(int age) {
        this.age = age;
    }
    private static BoyFriend bf=new BoyFriend(19);

    public static BoyFriend getInstance(){
        return bf;
    }

    @Override
    public String toString() {
        return "BoyFriend{" +
                "age=" + age +
                '}';
    }
}
