package com.List_;

public class Linkedlist02 {
    public static void main(String[]args){
        Node jack=new Node("jack");
        Node tom=new Node("tom");
        Node hsp=new Node("hsp");

        jack.next=tom;
        tom.next=hsp;
        hsp.pre=tom;
        tom.pre=jack;
        //定义链表头节点和尾节点
//        Node first=jack;
//        Node last=hsp;
        Node zhangfei=new Node("zhangfei");
        zhangfei.pre=jack;
        zhangfei.next=tom;
        tom.pre=zhangfei;
        jack.next=zhangfei;
        Node first=jack;
        Node last=hsp;

        System.out.println("=====下面是从头到尾对链表进行遍历======");

        while(true){
            if(first==null){
                break;
            }
            System.out.println(first);
            first=first.next;
        }
    }
}
class Node1{
    public Object item;
    public Node next;
    public Node pre;
    public Node1(Object name){
        this.item=name;
    }
    @Override
    public String toString() {
        return "Node1 name="+item;
    }
}

