package class3;

public class TypeCasting {//приведение
    public static void main(String[] args) {
        long number =125;
        byte shorterNumber = (byte) number;//byte shorterNumber=number;
        float f = 10.5f;//10 так как int целое число
        int num=(int)f;
        System.out.println(num);
        System.out.println(shorterNumber);
        byte b =10;
        int number2 = b;

        float eggs =12.5f;
        int wholePart = (int)eggs;
        System.out.println(wholePart);//12
        System.out.println((char)97);//a

    }
}
