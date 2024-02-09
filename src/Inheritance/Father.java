package Inheritance;

public class Father {
    int bike=76;
    String palace="palace";
    static class surya extends Father{
        public void prop23(){
            System.out.println("this is surya prop");
        }
    }
    static class naveen extends Father{
        public void prop98(){
            System.out.println("this is the naveen prop");
        }
    }

    public static void main(String[] args) {
        Father GF= new Father();
        System.out.println(GF.bike);
        Father KJ= new Father();
        System.out.println(KJ.palace);

    }
}
