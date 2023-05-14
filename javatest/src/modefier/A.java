package modefier;

public class A {
    public int n1=100;
    private int n2=200;
     int n3=300;
     protected int n4=400;
    //定义一个方法m输出这四个值，然后再新建一个类，调用m方法输出这四个值，能同时输出证明
    public int m(){
        System.out.println("n1的值为"+n1+"   n2的值为"+n2+"   n3的值为"+n3+"   n4的值为"+n4);
        return 0;
    }

}
