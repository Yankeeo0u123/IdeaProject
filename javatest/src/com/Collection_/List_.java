package com.Collection_;

import java.util.ArrayList;
import java.util.List;
public class List_ {
    public static void main(String[]args){

        List list =new ArrayList();
        list.add("小明");
        list.add("19");
        list.add("LOVE");
        System.out.println("List="+list);
        list.remove(2);
        System.out.println("List="+list);
        list.add("LOVE");
        System.out.println(list.contains("LOVE"));
        System.out.println(list.contains("LOVe"));
        System.out.println(list.size());
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list);
        ArrayList List2=new ArrayList();
        List2.add("小张");
        list.addAll(List2);
        System.out.println(list);
    }
}
