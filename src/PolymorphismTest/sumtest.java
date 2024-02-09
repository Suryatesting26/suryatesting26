package PolymorphismTest;

public class sumtest {

    public void sum (int a,int b){
        System.out.println(a+b);
    }
    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        sumtest kl=new sumtest();
        kl.sum(1,2);
        sumtest cv = new sumtest();
        cv.sum(1,2,3);

    }
}
