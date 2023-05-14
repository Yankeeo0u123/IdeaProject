package com.hspedu.main_;

public class Main01 {
    protected static String name="小花";  //这是一个静态属性
    public static void main(String[]args){
        System.out.println(name);
        hi();
        //cry();因为是非晶态，所以不能直接这样调用
        Main01 main001=new Main01();//定义类的对象，有class才是类
        main001.cry();//静态方法不能直接调用，可以给类创建一个对象，在对象中调用，虽然这个方法是pravite类型的，但是因为是在同一个类中，所以依然可以调用

    }
    private void cry(){
        System.out.println("非静态的方法cry");
    }

    public static void hi(){
        System.out.println("Main 的 hi方法");
    }
}
