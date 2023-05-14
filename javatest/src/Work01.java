public class Work01 {
    public static void main(String[]args){
      double  max=0;
      A01 a =new A01();
     System.out.println(a.max())  ;
    }
}
class A01{
    double array[]= {100,19,10,18,20,30,32,29};
   double max = array[0];
    public double max(){
    for(int i=1;i<array.length;i++){
        if (array[i]>max){
//把大的赋值给max，然后让max继续和下一个比较

            max = array[i];
        }

    }
        return max;
    }

}
