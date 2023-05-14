package com.Extend_;

public class test {
    public static void main(String[]args){
        Pupil pupil=new Pupil();
        pupil.name="小明";
        pupil.age=18;
        pupil.testing();
        pupil.setScore(50);
        pupil.Info();

        System.out.println("=================================================");
        Graduate graduate=new Graduate();
        graduate.name="张华";
        graduate.age=20;
        graduate.testing();
        graduate.setScore(20);
        graduate.Info();

    }

}
