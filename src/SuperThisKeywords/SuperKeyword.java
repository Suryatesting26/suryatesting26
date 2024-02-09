package SuperThisKeywords;

public class SuperKeyword {
    String MYNAME="surya";
    public void test765(){

    }
    static class sabbani extends SuperKeyword{
        public void test765(){
            System.out.println(super.MYNAME);
            super.test765();
        }

    }
    public static void main(String[] args) {
        sabbani rr=new sabbani();
        rr.test765();

    }
}
