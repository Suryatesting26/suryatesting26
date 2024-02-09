package Exeptions;

public class Arithmeticexeption {
    public static void main(String[] args) {
        try {int b=98;
            int v=0;
            int results=b/v;
            System.out.println(results);
        }catch (Exception e){
            System.out.println(e);

        }
    }
}