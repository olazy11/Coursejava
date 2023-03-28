package reps.done;
//Reverse the String without using the Reverse method from the BtringBuilder Class
//input["I am a java Programmer"] output["Programmer java a am I"]

//input["Syntax is Great"] output["Great is Syntax"]


import java.util.Arrays;

public class rep226 {
    public static void main(String[] args) {
       reverse("I am a java Programmer");
        reverse("Syntax is Great");

    }

    public static String reverse(String strToRev) {

        String reversedStr = " ";

       String [] arr = strToRev.split("[ ]");

        for(int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }



        return strToRev;
    }
}

