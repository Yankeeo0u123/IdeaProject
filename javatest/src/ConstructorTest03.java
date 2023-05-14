public class ConstructorTest03 {
    public static void main(String[]args){
    //Test04 t=new Test04("小明",10);
    //t.info();
        Test04 t1=new Test04();
        t1.info();
    }
}
class Test04{
    String name;
    int age;
     public Test04(String name,int age){
         this.name=name;
         this.age=age;
         System.out.println("这是有参数的构造器");
     }
    public Test04(){

        //this.info();
        this("JACK",20);//如果想使用this的话必须放在第一句
        System.out.println("这是无参数的构造器");
    }
    public void info(){
         System.out.println("哈哈哈");
    }

}
