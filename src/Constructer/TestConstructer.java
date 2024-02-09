package Constructer;

import com.sun.tools.javac.Main;

public class TestConstructer {
    int a;

    public TestConstructer(){
        System.out.println("this is the constructer");
        int a=87;
    }
    public static void main(String[] args) {
        TestConstructer RR= new TestConstructer();
        System.out.println(RR.a);

    }
}


