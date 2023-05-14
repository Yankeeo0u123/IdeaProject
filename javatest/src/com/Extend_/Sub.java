package com.Extend_;

public class Sub extends Base{
    public Sub(){
        System.out.println("sub()....");   //这个放在这里也没啥特殊的意义，就是子类自己的一个构造器
    }
    public void sayOK(){  //同上，子类自己的一个方法
        //非私有的属性和方法可以在子类中直接访问
        //私有属性和方法不能在子类中直接访问
        System.out.println(n1+" "+n2+"  "+n4);//n3是父类私有的，子类不能访问，只能通过父类中能返回n4的公共方法访问
        test01();
        test02();
        test04();   //test03是私有方法，也得用公共的方法访问
        System.out.println("n4"+getN4());
    }

}
