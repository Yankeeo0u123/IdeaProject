package com.List_;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[]args){
        List list = new ArrayList();
        //添加
        list.add("java");
        list.add("前端");
        list.add(1,"cpp");
        System.out.println(list);
        List list2=new ArrayList();
        list2.add("小明");
        list2.add("李华");
        //添加一个队列
        list.addAll(1,list2);
        list.add("java");
        System.out.println(list);
        //indexOf是指第一次出现的位置，后面再有小明和李华也不管了
        System.out.println(list.indexOf("小明"));
        System.out.println(list.indexOf("李华"));
        System.out.println(list.indexOf("java")); //0
        System.out.println(list.lastIndexOf("java")); //5
        //移除
        list.remove(2);
        System.out.println(list);
        //置换元素
        list.set(1,"anyone");
        System.out.println(list);
        //因为这个是直接新定义了一个List,所以开头是大写的
        List returnList=list.subList(0,4);
        System.out.println(returnList); //此returnList是一个左闭右开的区间
        List newList=list.subList(0,2);  //只能是你的类中定义的list，不能是上一个subList；
        System.out.println(newList);



    }

}
