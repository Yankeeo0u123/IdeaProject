public class VarscopeDetail{
    public static void main(String[]args){
     Personn p=new Personn();
     p.Tools();
     p.Tools1(); //调用这个类里面的方法才能执行方法对应的语句，才能有输出
        Personn p1=new Personn();
        p1.Tools();
        T t=new T();
        t.Tools2(p1);
        F f=new F();
        f.Tools3();
    }
}

//创建一个新的类用于尝试调用其他类
//这是第二种调用方法，通过传递参数进行调用
class T{
    public void Tools2(Personn p1){
        p1.Tools();
        System.out.println("这是通过第二种方法实现age的调用，输出age的值为"+p1.age);
    }

}

//采用第一种方法，直接调用其他类的对象
class F{
    public void Tools3(){
        Personn p2=new Personn();
        System.out.println("这是通过第一种方法实现age的调用，输出age的值为"+p2.age);

    }
}


class Personn{
    String name ="Tom";
    int age =19;
    public void Tools(){
        System.out.println("可以输出全局变量age的值为"+ age);
    }
    public void Tools1(){
        int age=20;
        System.out.println("可以输出局部变量age的值为"+ age);

    }
 }

