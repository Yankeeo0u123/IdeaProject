package com.cellection_;


import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
@SuppressWarnings({"all"})
public class CollectionIterator {
    public  static void main(String args[]) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "吴承恩", 10));
        col.add(new Book("西游记", "罗贯中", 11));
        System.out.println("col" + col);

        Iterator iterator = col.iterator();
        Object obj = null;
        //while用的是迭代器
//        while (iterator.hasNext()) {
//            obj = iterator.next();
//            System.out.println(obj);
//        }
        //简化for用的是增强版的迭代器，虽然用的不是iterator是collection，但底层依然是迭代器
        for(Object book:col ){
            System.out.println(book);
        }


    }
}
class Book{
    private String name;
    private String Author;
    private int  price;

    public Book(String name,String Author,int price){
        this.name=name;
        this.Author=Author;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                '}';
    }
}
