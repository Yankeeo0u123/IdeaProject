public class Mtest {
    public static void main(String[] args){
       Person p1 = new Person();
      int  res =p1.getSum(2,3);
System.out.println(res);
    }

 }
class Person{
    int age=18;

    public int getSum(int a,int b){
       int c=a + b;
        return c;
    }

}
