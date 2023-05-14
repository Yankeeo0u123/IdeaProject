package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[]args){
        B b=new B();
        System.out.println(B.n1);
        System.out.println(b.n1);

    }
}
class B{
    public static int n1=100;
}
class C{
    public static String add="北京";
}