package com.hspedu.Single_;

public class Singleton01_ {
    public static void main(String args[]){
        Girlfriend instance = Girlfriend.getInstance();
        System.out.println(instance);



    }
}
class Girlfriend{
    private String name;
    //1

    private  Girlfriend(String name) {
        this.name = name;
    }
    //2 对象是私有的 用不了
    private  static Girlfriend gf1 = new Girlfriend("小红");
    public static Girlfriend getInstance(){
        return gf1;
    }

    @Override
    public String toString() {
        return "Girlfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}