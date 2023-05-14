package com.List_;

import java.util.ArrayList;
//import java.util.ComparableTimSort.sort();
import java.util.List;
import java.util.Iterator;
public class ListExercise02 {
    public static void main(String []args){
        List list=new ArrayList();
        list.add(new Book("红楼梦",100,"曹雪芹"));
        list.add(new Book("三国演义",120,"罗贯中"));
        list.add(new Book("西游记",80,"吴承恩"));
        Iterator iterator=list.iterator();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //向下转型
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                //进行比较 替换
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
        //增强for输出打印
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
class Book{
    String name;
    int price;
    String author;
    public Book(String name,int price,String author){
        this.name=name;
        this.price=price;
        this.author=author;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
