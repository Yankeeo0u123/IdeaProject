public class ContractorTest04 {
    public static void main(String []args){
     Test05 t=new Test05("小明",19);
     Test05 t1=new Test05("小明",19);
     System.out.println(t.compareTo(t1));
    }

}
class Test05{
    String name;
    int age;
    public Test05(String name,int age){
        this.name=name;
        this.age=age;
    }
    public boolean compareTo(Test05 t1){
      return this.name.equals(t1.name) &&this.age ==t1.age;   //return就会返回布尔类型的值，通过判断出 是 还是否 然后返回并输出这个值
    }
}