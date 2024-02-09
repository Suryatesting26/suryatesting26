package Exeptions;

public class ArrayindexoutbondExeption {
    public static void main(String[] args) {
        try {

        int f[]={2,4,3};
            System.out.println(f[8]);

        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("maggi");
            System.gc();
        }
    }
}
