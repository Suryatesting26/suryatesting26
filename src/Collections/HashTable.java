package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> details = new Hashtable<Integer,String>();
        details.put( 7,"raju");
        details.put( 8,"bunty");
        details.put( 0,"bhanu");
        details.put( 3,"ramesh");
        details.put( 9,"raju");
        //details.put( 2,null);
        for (Map.Entry surya:details.entrySet()){
            System.out.println(surya.getKey()+":"+surya.getValue());

        }
    }
}
