package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List123 {

    public static void main(String[] args) {
        List<String>NAMES=new ArrayList<String>();
        NAMES.add("ganesh");
        NAMES.add("tony");
        NAMES.add("RAJU");
        NAMES.add("RAJU");
        NAMES.add("kiran");
        NAMES.add(null);
       // NAMES.remove("ganesh");
      //  NAMES.add("ganesh");
        Iterator itr= NAMES.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }





    }
}
