//public class OverLoadExercise {
//
//    public static void main(String[]args){
//    Methods p=new Methods();
//        p.m(6);
//        p.m(7,8);
//        p.m("罗纳尔多");
//        System.out.println(p.max(1,2));
//        System.out.println(  p.max(1.2,2.1));
//        System.out.println(p.max(1.2,2.1,4.8));
//    }
//
//
//class  Methods{
//    public void m(int a){
//        int sum=a*a;
//        System.out.println(sum);
//    }
//    public void m(int a,int b){
//        int sum=a*b;
//        System.out.println(sum);
//    }
//    public void m(String c){
//        System.out.println(c);
//    }
//    public int  max(int a,int b){
//        if(a>b){
//            return a;
//        }else{
//            return b;
//        }
//    }
//    public double max(double a,double b){
//        if(a>b){
//            return a;
//        }else{
//            return b;
//        }
//    }
//    public double  max(double a,double b,double c){
//        if(a>b){
//           if(a>c){
//               return a;
//           }else{
//               return c;
//           }
//        }else if(b>c) {
//            return b;
//        }
//        return c;
//    }
//}
//}
//
