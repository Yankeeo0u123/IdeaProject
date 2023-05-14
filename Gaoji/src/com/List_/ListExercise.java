package com.List_;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@SuppressWarnings({"all"})
public class ListExercise {
    public static void main(String[]args){
       List list = new ArrayList();
        for (int i=0;i<12;i++){
            list.add("hello"+i);
        }
        //2号位不是索引为2，是第二个元素，所以索引应该为1
        //list.add(2,"韩顺平教育"); 这样的写法是错误的
        list.add(1,"韩顺平教育");
        System.out.println(list);
        System.out.println(list.get(5));
        list.remove(6);
        System.out.println(list);
        list.set(7,"good");
        System.out.println(list);
        //迭代需要使用迭代器，光记住col.忘了迭代器
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }

    }

}
