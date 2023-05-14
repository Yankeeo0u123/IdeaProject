package com.linkList_;

public class Linklist_ {
    public static void main(String[]args){
        //链表定义好后好之后就可以创建节点了
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2,node1);
        ListNode node3=new ListNode(6,node2);
        ListNode node4=new ListNode(3,node3);
        ListNode node5=new ListNode(4,node4);
        ListNode node6=new ListNode(5,node5);
        ListNode node7=new ListNode(6,node6);
        Solution sol=new Solution();
        //System.out.println(sol.removeElements(node1,6).toString());
        Linklist_ .printLinkedList(node1);
    }
    public static void printLinkedList(ListNode node1){
        while(node1 != null){
            System.out.print(node1.val);
            node1= node1.next;
        }
        System.out.println();
    }
}


//写完算法以后首先定义节点
class ListNode{
    public int val;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", val=" + val +
                '}';
    }
}

//这个就是在定义链表吧
class Solution{
    //定义一个方法，removeElements,两个参数，一个是头节点，一个是要删除的number
    //ListNode是节点的意思
    public ListNode removeElements(ListNode head,int val){
        //如果头节点为空，链表不存在，直接返回head就好，head是空值
        if(head==null){
            return head;
        }
        ListNode dummy=new ListNode(-1,head);
        //节点dummy的值是-1，是头节点
        //虚拟头节点和当前节点
        ListNode pre=dummy;
        ListNode cur=head;
        while(cur!=null){// 当前节点的值不为空的时候
            if(cur.val==val){
                pre.next=cur.next;//进行删除操作
            }else{
                pre=cur;//不是当前的话，就换下一个，把这个变成前值,cur保存下来，这句话是赋值的作用
                // 为了下一步向后遍历向后遍历，直到不满足，跳出循环
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}
