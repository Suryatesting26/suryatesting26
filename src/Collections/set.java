package Collections;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<String> NAMES=new HashSet<>();
        NAMES.add("ganesh");
        NAMES.add("tony");
        NAMES.add("RAJU");
        NAMES.add("RAJU");
        NAMES.add("kiran");
        NAMES.add(null);
        Iterator itr= NAMES.iterator();
        /*while (itr.hasNext()){
            System.out.println(itr.next());*/
        for (String SSS:NAMES){
            System.out.println(SSS);
        }
        }
    }




