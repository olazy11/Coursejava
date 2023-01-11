package Class6;

public class SwitchCase {
    public static void main(String[] args) {
        int day =1;
        switch (day) {
            case 1:  System.out.println("M");
            break;
            case 2: System.out.println("T");
            break;
            case 3: System.out.println("W");
            break;
            case 4: System.out.println("Th");
            break;
            case 5: System.out.println("F");
            break;
            case 6:System.out.println("Sat");
            break;
            case 7: System.out.println("Sun");
            break;
            default:
                System.out.println("Wrong day");
        }
    }
}
