import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("unchecked")
public class ListMethord {
    public static void main(String args[]){
     List list=new ArrayList();
    for(int i=0;i<10;i++){
        list.add("hello"+i);
    }
        System.out.println(list);
    list.add(1,"易烊千玺");
        System.out.println(list);
        list.remove(2);
        list.indexOf("易烊千玺");
        System.out.println(list);
        

    }

}
