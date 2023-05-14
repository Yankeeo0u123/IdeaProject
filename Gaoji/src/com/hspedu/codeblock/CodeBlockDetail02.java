package com.hspedu.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[]args){
        A a=new A();
        //  System.out.println(A.n1);
    }

}
class A{
    private int n2=getN2(); //这是一个普通属性，加载类的时候也能用，但是优先级没有静态的高
    //3和4的优先级是一样的，就看位置，谁先被调用，就先输出谁

    {
            System.out.println("4 lalala");
    }

    static{
        System.out.println("1 lala");
    }
    private static int n1=getN1();
    public static int getN1(){
        System.out.println("2 getN1被调用"); //因为类加载的时候先加载private static int n1
        return 100;
    }
    public int getN2(){ //这是一个普通方法
        System.out.println("3 getN2被调用"); //因为类加载的时候先加载private static int n1
        return 200;
    }

}

