package groupProject;

public class MarksTester {
    public static void main(String[] args) {
        Marks [] av = {new A(3.1,4.6,5.0), new B(2.7,4.1,5.0,3.7)};
        for (Marks x: av){
            System.out.println(x.getPercentage());        }    }
}
