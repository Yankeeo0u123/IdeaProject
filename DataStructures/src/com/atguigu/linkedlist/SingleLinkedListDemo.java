package com.atguigu.linkedlist;

public class SingleLinkedListDemo {
    public static void main(String[]args){
        //进行·   测试，先创建节点
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"吴用","智多星");
        HeroNode hero3 = new HeroNode(3,"林冲","豹子头");

        //创建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.list();



    }
}
//除了定义节点 还要定义单链表，用于管理节点
class SingleLinkedList{
    //先初始化一个头节点
    private HeroNode head=new HeroNode(0,"","");
    //添加节点到链表的思路是不按照顺序添加的话直接加到最后一个位置
    public void add(HeroNode heroNode){
        HeroNode temp=head;
        while(true){
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=heroNode;
    }
    //显示链表【遍历】
    public void list(){
        //判断链表是否为空
        if(head.next==null){
            System.out.println("链表为空");
        }
        HeroNode temp=head.next;
        while(true){
            //判断是否到链表最后
            if(temp==null){
                break;
            }
            //不为空，就输出节点信息
            System.out.println(temp);
            //将temp后移
            temp=temp.next;
        }
    }
}

// 每个节点就是一个类，用类的形式去定义节点
class HeroNode{
    public int no;
    public String name;
    public String NickName;
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        NickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", NickName='" + NickName  +
                '}';
    }
}