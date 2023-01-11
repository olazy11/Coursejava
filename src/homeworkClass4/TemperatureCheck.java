package homeworkClass4;

import java.util.Scanner;

/*
Create a Java program and name it Temperature Check. Create variable to store temperature.
Your program should check if temperature
is below 32 then it should print “Water will freeze with temperature ”,
otherwise “Water will NOT freeze with temperature ”.
 */
public class TemperatureCheck {
    public static void main(String[] args) {
        System.out.println("Please enter your temperature");
        Scanner input = new Scanner(System.in);
        int temp=input.nextInt();

    if(temp<32){
        System.out.println("Water will freeze with temperature");
    }else

    {
        System.out.println("Water will NOT freeze with temperature");
    }

}
}
