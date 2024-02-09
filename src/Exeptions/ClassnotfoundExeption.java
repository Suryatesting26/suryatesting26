package Exeptions;

public class ClassnotfoundExeption {
    private static final String CLASS_NOT_FOUND="RAJU";

    public static void main(String[] args) {
        try {
            Class test2 = Class.forName("TTTT");
            System.out.println("Class"+ test2 +"found suceesfully!");

        }catch (ClassNotFoundException JJ){
            System.err.println("Classnotfoundexeptions was found:"+JJ.getMessage());
            JJ.getStackTrace();
        }

    }
}
