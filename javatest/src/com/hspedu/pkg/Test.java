//package com.hspedu.pkg;
//
//public class Test {
//    public static void main(String[]args){
//    Person person =new Person();
//        person.setName("张华");
//        person.setAge(121);
//       person.setSalary(26000);
//       System.out.println(person.info());
//        System.out.println(person.getSalary());
//
//        //接下来使用构造器指定属性
//        Person smith =new Person("smith",2000,50000);
//        System.out.println("================以下是smith的信息================");
//        System.out.println(smith.info());
//
//    }
//}
//class Person{
//   public String name;
//     private int age;
//    private int salary;
//    public Person() {
//
//    }
//    public Person(String name, int age, int salary) {
//        setSalary(salary); //等价于this.
//        setName(name);
//        setAge(age);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        //加入对数据的校验
//        if(name.length()>=2&&name.length()<=6){
//            this.name=name;
//        }else{
//            System.out.println("名字的长度在2到6个字符之间");
//        }
//
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if(age>=1 && age<= 120 ){
//            this.age = age;
//        }else{
//            System.out.println("年龄需要在1-120岁之间，给你一个磨人年龄为18");
//            this.age=18;//给一个默认的年龄
//        }
//
//    }
//
//    public int getSalary() {
//        //在返回这里可以增加对当前对象的权限判断
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        if(salary<=25000){
//            System.out.println("不好意思，默认的薪资是30000");
//            this.salary=30000;
//        }else{
//            this.salary = salary;
//        }
//
//    }
//    //新建一个方法，面向对象编程
//    public int info(String name,int age,int salary){
//        return salary;    //方法里只有这一个语句，返回啥，上面调用这个方法的时候就输出啥
//
//    }
//}
