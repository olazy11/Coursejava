package class14;
/*
* identify sentences*/
public class SplitMethodDemo {
    public static void main(String[] args) {
        String str="I like java. I write a lot of code daily. I am from batch 15.";
        String [] strArr=str.split("[.]");
        System.out.println(strArr.length);//length without parenthesis
        System.out.println(strArr[0].trim());//get the sentence 3 and trim remove space at the beginning
        //whenever we are working with arrays we use the length and whenever we are working with Strings
        // we use the length()


    }
}


