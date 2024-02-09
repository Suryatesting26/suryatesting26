package PolymorphismTest;

public class Parentclass1 {
    static void testmethod1(){
        System.out.println("this is the parent class");
    }
    static class childclass extends Parentclass1 {
        static void testmethod2() {
            System.out.println("this is the child class");

        }
    }

        public static void main(String[] args) {
            childclass JH= new childclass();
          //  JH.testmothod
            Parentclass1 KK= new Parentclass1();
            //KK.testmethod2
                    

        }
    }



