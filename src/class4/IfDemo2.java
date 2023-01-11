package class4;
public class IfDemo2 {
}
class If {
    public static void main(String[] args) {

        int money=15000;
        if (money>1000) {
            System.out.println("Lets buy Iphone");
        }
        if (money>2000){
            System.out.println("Lets also buy a Macbook");
        }

        String name ="Saradar";
        if (name.equals ("Sardar")){//for String we use equals method , it is non-primitive data type
            System.out.println("I love football");
        }
    }
}
