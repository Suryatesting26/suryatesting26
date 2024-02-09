package Collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args){
        HashMap<Integer,String>details= new HashMap<Integer,String>();
        details.put( 9,"raju");
        details.put( 8,"bunty");
        details.put( 0,"bhanu");
        details.put( 3,"ramesh");
        details.put( 9,"raju");
        details.put( 2,null);
        for (Map.Entry surya:details.entrySet()){
            System.out.println(surya.getKey()+":"+surya.getValue());

        }
    }
}
