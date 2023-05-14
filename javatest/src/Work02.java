public class Work02 {
    public static void main(String[]args){
        int i=0;
        String array[]={"赵","钱","孙","李","周","吴","郑","王"};

        A02 a2=new A02();
        a2.find("王",array);

    }
}
class A02{
    String Finder;
    int i=0;
    String array[]={"赵","钱","孙","李","周","吴","郑","王"};
    public int  find(String Finder, String [] array){
        for(int i=0;i<array.length;i++) {
            if (Finder.equals(array[i])) {
                System.out.println(i);
                return i;
            }
        }
        return -1;

    }
}

