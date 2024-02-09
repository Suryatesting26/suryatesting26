package EncapslationTest;

public class person {
    private String Myname;
    private int myage;
    public String getMyname(){
        return Myname;
    }
    public void setMyname(String MyName){
        Myname=MyName;
    }
    public int getAge(){
        return myage;
    }
    public void setAge(int Myage){
        myage=Myage;

    }
    public static void main(String[] args) {
        person SS= new person();
        SS.setMyname("SURYA");
        SS.setAge(28);
        System.out.println("my name is "+ SS.getMyname()+ "and my age is"+ SS.myage);

    }
}
