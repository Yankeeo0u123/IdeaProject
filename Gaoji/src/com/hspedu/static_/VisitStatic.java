package com.hspedu.static_;

public class VisitStatic {
    public static void main(String[]args){
        System.out.println(A.name);
        //类变量是随着类的加载而创建的
        //即使没有对象实例也可以访问
        A a=new A();
        System.out.println(a.name);
    }
}
class A{
    public static String name="韩顺平教育";
}