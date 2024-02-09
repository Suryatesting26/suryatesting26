package AbstractTest;

 abstract class AbstractClass {
     abstract void TestClass();

     static class mybike extends AbstractClass {
         public void TestClass() {
             System.out.println("my bike is giving 1ltr for 211 kms");
         }

         static class myhonda extends AbstractClass {
             public void TestClass() {
                 System.out.println("my honda bike is giving 1ltr for 654kms");
             }
         }

         public static void main(String[] args) {
             myhonda jh = new myhonda();
             jh.TestClass();


         }
     }
 }
