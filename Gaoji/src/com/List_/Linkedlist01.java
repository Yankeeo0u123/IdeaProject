package com.List_;

public class Linkedlist01 {
    public static void main(String[]args){
        //先写的下面的类，类写完之后
        //在主类中定义节点对象
        Node jack=new Node("jack");
        Node tom=new Node("tom");
        Node Hsp=new Node("Hsp");
        //这三个节点目前各自存在，没有任何关系，我们要让这三个节点互相关联，通过类Node中所定义的
        //链接三个节点，形成双向链表
        jack.next=tom;
        tom.next=Hsp;
        Hsp.pre=tom;
        tom.pre=jack;

        //三个节点关联之后还得有头有尾；
        Node first=jack; //让first引用 指向jack,就是双向链表的头节点；
        Node last=Hsp;//这是双向链表的尾节点；
        System.out.println("=====从头到尾的遍历=======");

        //链表对于节点的添加，删除，遍历很方便
        while(true){
            if(first==null){
                break;
            }
            System.out.println(first);
            first=first.next;
        }
        System.out.println("=====从尾到头的遍历=======");
        while(true){
            if(last==null){
                break;
            }
            System.out.println(last);
            last=last.pre;

        }
    }

}
//Node是一个类，可以被实例化，实例化以后就成了一个对象,表示双向链表的一个节点
class Node{
    public Object item; //这个是object类；真正存放数据的地方，所以是Object类；
    public Node next;  //这个是node类，节点，指向下一个节点
    public Node pre;  //指向前一个节点
    //在Node类中定义构造器
    public Node(Object name){
        this.item=name;
    }

    @Override
    public String toString(){
        return "Node name="+item;
    }
    //定义完，写完构造器，写完toString方法，这个Node就算完成了
}