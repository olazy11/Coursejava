package class7;

public class While10 {
    /*public static void main(String[] args) {
       /* int num = 1;

        while (num<=16) {
            if (num==5||num==10||num==15) { //easier to understand
            }else{
            System.out.println(num);
            num++;
            }*/
        public static void main(String[] args) {
        int num2 = 1;
        while (num2 <= 16) {
            if (num2%5!= 0) {
                System.out.println(num2);
            }
            num2++;
        }
    }
}
