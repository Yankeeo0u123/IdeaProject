public class ConstructorThis {
    public static void main(String[]args){
    Test07 t=new Test07("张明",19);
      t.info();

        Test07 t1=new Test07("丽华",20);
        t1.info();
    }
}
class Test07{
    String name;
    int age;
    //public Test07(String name,int age){  //构造器是方法初始化，这块最后还搞不出来就去看看构造器的课程
      //  this.name=name;
        //this.age=age;
    //}
    public Test07(String PName,int PAge){  //构造器是方法初始化，这块最后还搞不出来就去看看构造器的课程
        name=PName;
        age=PAge;

    }
    public void info(){
        //System.out.println("对象的姓名为"+this.name+"  对象的年龄为"+this.age);
        //System.out.println("this所指的对象的哈希值为"+this.hashCode());

        //注释的这句应该是有问题的，因为上面的形参直接写的name和age,应该只能用this 调用
    }
}
