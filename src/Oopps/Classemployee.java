package Oopps;

public class Classemployee {
        String empname="SURYA";
        int empage=28;
        String designation="QA Analyst";

        public void dance() {
            System.out.println("i can dance");
        }
        public void paly(){
            System.out.println("i can play");
        }
        public static void main(String[] args) {
           Classemployee KTR=new   Classemployee();
           KTR.dance();
           KTR.paly();
            System.out.println(KTR.empname);
            System.out.println(KTR.designation);
            System.out.println(KTR.empage);
    }
}
