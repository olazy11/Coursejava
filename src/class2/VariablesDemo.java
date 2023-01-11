package class2;

public class VariablesDemo {
    public static void main(String[] args) {
        int numberBox =10;//не надо определять тип данных второй раз,во второй строке
        numberBox=20;//overwriting or reassigning a new value to a box, turn 10 to 20
        System.out.println(numberBox);//тот же бокс,чтобы не создавать новые,переписываем в том же,экономим память
        numberBox=30;
        System.out.println(numberBox+20);
        int number =20;
        int number2 =20;
        int number3 =20;
        int number4 =20;

        System.out.println(numberBox*1);
        System.out.println(numberBox*2);
        System.out.println(numberBox*3);
        System.out.println(numberBox*4);
    }
}
