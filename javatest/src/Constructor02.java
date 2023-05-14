public class Constructor02 {
    public static void main(String[]args){
        Person01  p1=new Person01();
        System.out.println("P1的名字是"+p1.name+"P1的年龄是"+p1.age);
        Person01  p2=new Person01("张华",18);
        System.out.println(p2.name+p2.age);
    }

}
class Person01{
    int age;
    String name;
    public Person01(){
        age =18;
    }
    public Person01(String PName,int PAge){
          age=PAge;
          name=PName;
    }
}
