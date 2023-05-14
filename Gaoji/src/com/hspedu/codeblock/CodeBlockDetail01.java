package com.hspedu.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[]args){
        AA aa=new AA();//写完这句话就有输出了，因为 在创建实例化对象的时候就出现了类被加载
        CC cc2=new CC();
        AA aa1=new AA();
        CC cc=new CC();
        //2 创建子类对象的时候，父类也会被加载,而且是先加载父类，这个问题之前讲过
        System.out.println(Cat.n1);
    }
}
class Cat{
    public static int n1=999;//静态属性
    static{
        System.out.println(" AA的静态代码块又被执行");
    }
}
class CC{
    static{
        System.out.println("CC的静态代码块被执行");
    }
}
class BB{
    static{
        System.out.println("1 AA的静态代码块被执行");
    }
}
class AA extends BB{
    static{
        System.out.println("2 AA的静态代码块被执行");
    }
}

