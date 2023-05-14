public class ConStructorTest02 {
    public static void  main(String []args){
    Dog d=new Dog("大壮",19);
    System.out.println("2this的哈希地址为"+d.hashCode());
    d.info();
    }

}
class Dog{
    String name;
    int age;
    public Dog(String name,int age){   //先进构造器传参，学参数的时候老师说根据实参和形参的个数去找对应的方法
        this.name=name;
        this.age=age;
        System.out.println("1this的哈希地址为"+this.hashCode());
    }
    public void info(){
        System.out.println(name+"\t"+age+"\t");
        System.out.println("3this的哈希地址为"+this.hashCode());
    }

}
