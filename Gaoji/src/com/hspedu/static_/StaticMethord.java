package com.hspedu.static_;

public class StaticMethord {
    public static void main(String[]args){
        Stu Tom=new Stu("Tom");
        Tom.payFee(100);
        Stu mary=new Stu("mary");
        mary.payFee(100);
        mary.showFee();
        Mytools.Mysums(1,2);
    }
}
class Mytools{
    public static int Mysums(int n1,int n2){
        int sum;
        System.out.println(sum=n1+n2);
        return sum;
    }
}
class Stu{
    private String name;
    //fee变量即将被共享
    private static double fee=0;
    public Stu(String name){
        this.name=name;
    }
    public static void payFee(double fee){
        Stu.fee+=fee;
    }
    public static void showFee(){
        System.out.println("总学费有："+Stu.fee);
    }

}
