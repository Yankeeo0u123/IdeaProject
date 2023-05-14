public class test {
    public static void main(String[]args){
           A a= new A();
           a.print(3);
        a.print2();

    }

}
class A{
    public void print(int n) {
        System.out.println("n的值为" + n);
    }
    public void print2(){
        B b=new B();
        b.print3();
        System.out.println("7");
    }
}
class B{
    public void print3(){
    System.out.println("6");

    }
}
