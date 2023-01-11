package homeworkClass5;

import java.util.Scanner;

/*
You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver licence to them,
 otherwise you will offer them to get a learners permit.
 */
public class task4 {
    public static void main(String[] args) {
        int age = 18;
        Scanner licence = new Scanner(System.in);
        System.out.println("How old are you?");
        int yourage = licence.nextInt();

    if (yourage>=18) {
        System.out.println("Your licence will be issued");
    }else{
        System.out.println("You are offered to have your learner permit");
    }


    }
}
