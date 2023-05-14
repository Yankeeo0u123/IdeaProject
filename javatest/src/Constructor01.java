import java.awt.print.Pageable;

public class Constructor01 {
    public static void main(String[]args){
     Person3 p=new Person3("Tom",19);
    }

}

class Person3{
    String name;
    int age;
    public Person3(String PName,int PAge){  //需要有标识符
        System.out.println("构造器完成，同时也完成了对象属性的初始化");
        name=PName;
        age= PAge;
    }

}

