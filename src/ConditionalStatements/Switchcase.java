package ConditionalStatements;

public class Switchcase {
    public static void main(String[] args) {
        String switchboard="FAN";
        switch ("TV"){
            case "AC":
                System.out.println("SWITCH ON AC");
                break;
            case "tv":
                System.out.println("SWITCH ON TV");
                break;
            case "FAN":
                System.out.println("switch on FAN");
                break;
            default:
                System.out.println(" NO SWITCH AVAILABLE");
        }
    }
}
