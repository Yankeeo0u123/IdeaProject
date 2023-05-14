package com.List_;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Listfor {
    public static void main(String[]args){
        List list=new ArrayList();
        list.add("鱼香肉丝");
        list.add("溜肉段");
        list.add("锅包肉");
        list.add("北京烤鸭");
        System.out.println(list);
        Iterator iterator=list.iterator();
        //应该是判断这个是否为0，不为0遍历这个
        while(iterator.hasNext()){ //判断迭代器 cursor 位置所表示的长度与集合的长度是否不相等
            Object obj=iterator.next(); //所以等号右边是iterator.Next
            //.next是把当前位置元素索引移至下一个
            System.out.println(obj);
        }
        for(Object i:list){
            System.out.println(i);
        }
        for(int i=0;i<list.size();i++){ //用的是.size的方法，所以要用加上()
            System.out.println(list.get(i));
        }
    }
}
