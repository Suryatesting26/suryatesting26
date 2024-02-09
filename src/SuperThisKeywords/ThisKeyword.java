package SuperThisKeywords;

public class ThisKeyword {
    String myname ="john";
    public void datatest87(){

    }
    static class deer extends ThisKeyword{
        public void datatest87(){
            System.out.println(this.myname);
        }
    }

    public static void main(String[] args) {
        deer jhk=new deer();
        jhk.datatest87();

    }
}
