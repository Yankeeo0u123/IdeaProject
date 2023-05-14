package com.List_;

public class LinkedList03 {
    public static void main(String[]args){
        //进行测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3 = new HeroNode(3,"吴用","智多星");
        //创建要给的链表
        SingleLinkedList singleLinkedList=new SingleLinkedList();
//        singleLinkedList.add(hero1);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);
        singleLinkedList.addByOrder(hero1);
        singleLinkedList.addByOrder(hero3);
        singleLinkedList.addByOrder(hero2);
        //显示一把
        singleLinkedList.list();
    }
}
//定义一个SingleLinkedList描述HeroNode
class SingleLinkedList{
    private HeroNode head=new HeroNode(0,"","");
    //private HeroNode heroNode;

    //定义一个参数为空的头节点，只有number=0；
    //添加节点到单向链表
    //思路：当不考虑编号顺序的时候
    //1.首先找到当前链表的最后节点
    //2.将这个节点的next指向新的节点
    public void add(HeroNode heroNode){
        //因为head节点不能动，所以需要一个辅助遍历temp
        HeroNode temp=head;//初始化定义这个temp指向head
        //遍历链表，找到最后
        while(true){
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }
        //退出while之后，temp就指向了链表的最后
        //将最后的这个next节点指向新的节点
        temp.next=heroNode;
    }
    public void addByOrder(HeroNode heroNode){
        HeroNode temp=head;
        boolean flag=false;
        while(true){
            if(temp.next==null){
                break;
            }
            if(temp.next.no>heroNode.no){
                break;
                //位置找到，就在temp后面插入
            } else if (temp.next.no==heroNode.no) {
                flag=true;//说明编号存在
                break;
            }
            //以上都是能直接判断出来的
            temp=temp.next;//后移，遍历当前链表
        }
        //判断flag的值
        if(flag){
            //不能添加，说明值已经存在
            System.out.println("英雄编号为"+heroNode.no);
        }else{
            //插入到链表中temp的后面
            heroNode.next=temp.next;
            temp.next=heroNode;
        }
    }
    //显示链表 遍历
    public void list(){
        //判断链表是否为空
        if(head.next==null){
            System.out.println("链表为空");
            return;
        }
        //因为头节点不能动，所以需要一个辅助变量去遍历
        HeroNode temp=head.next;
        while(true){
            if(temp==null){
               break;
            }
            //输出节点的信息
            System.out.println(temp);
            //将next后移
            temp=temp.next;
        }
    }
    //删除节点
//1.因为head不能动，因此我们需要找一个temp辅助节点，找到待删除节点的前一个节点
//2 在比较的时候。是temp.next.no和需要 删除的节点的no相比较
    public void del(int no){
        HeroNode temp=head;
        boolean flag=false;
        while(true){
            if(temp.next==null){ //已经到链表的最后
                break;
            }
            if(temp.next.no==no){
                //找到待删除节点的前一个节点
                flag=true;
                break;
            }
            temp=temp.next;//temp后移，遍历
        }
        //判断flag
        if(flag){

        }
    }
}

class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
