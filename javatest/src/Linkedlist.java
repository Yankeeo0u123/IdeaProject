import java.util.ArrayList;
import java.util.List;
public class Linkedlist {
    /**
     * @param args
     */
  @SuppressWarnings("unchecked")
    public static void main(String[]args){

        List list= new ArrayList<>();
        list.add("张三丰");
        list.add("韩顺平");
        list.add(1,"贾宝玉");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("蔡徐坤");
        list2.add("易烊千玺");
        list.addAll(1,list2);
        System.out.println(list);
        System.out.println(list.indexOf("易烊千玺"));
       list.remove(3);
        list.set(3,"黑马IT");
      System.out.println(list);

    }
}

