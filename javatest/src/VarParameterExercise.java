public class VarParameterExercise{
    public static void main(String[]args){
        HspMethod hm=new HspMethod();
        System.out.println(hm.showScore("嘻嘻",20,20,20));
        System.out.println(hm.showScore("哈哈",10,10,10));
    }

}
class HspMethod{
    public String showScore(String name,int...num){
        int res=0;
        for(int i=0;i<num.length;i++){
            res+=num[i];
        }
        return name+"的同学的总分数为"+res;
    }

}