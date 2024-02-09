package Exeptions;

public class StringindexoutbondExeption {
    public static void main(String[] args) {
        try {
            String david = "john";
            char raju = david.charAt(9);
            System.out.println("the string lenth is 6"+raju);
        }catch (StringIndexOutOfBoundsException GG){
            System.out.println(GG);
        }
    }
}
