public class SUM {
    public static  void main(String[]args){

        Tools tools=new Tools();
        int []resArr=tools.getSUMAndSub(1,2);
        System.out.println(resArr[0]);
        System.out.println(resArr[1]);
    }
}
class Tools{
    public int[] getSUMAndSub(int a,int b){
        int []resArr=new int[2];
        resArr[0]=a+b;
        resArr[1]=a-b;
        return resArr;
    }


}
