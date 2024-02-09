package Interface;

//public class Logintest {
    interface logintes1{
        abstract void logintest1();
}
    interface logouttest2 {
        abstract void logouttest2();

        class gmail implements logintes1, logouttest2 {
            @Override
            public void logintest1() {
                System.out.println("this is the login test");
            }

            public void logouttest2() {
                System.out.println("this is the logout test");
            }
        }

        public static void main(String[] args) {
            gmail nn=new gmail();
            nn.logintest1();
            nn.logouttest2();

        }
    }

