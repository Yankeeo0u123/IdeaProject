package modefier;

public class B {
    public int f(){
        A a=new A();
        //A和B在同一个包下，可以访问除访问修饰符为private以外的其他变量
        System.out.println(a.n1+"  "+a.n3+"  "+a.n4);
        return 0;
    }
}
