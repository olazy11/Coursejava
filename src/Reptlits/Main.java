package Reptlits;

public class Main {
    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o")); //"techn(o)l(o)gy"
    }

    static String surround(String s, String c) {
        String search_term = new String();
        for (int i = 0; i < s.length(); i++) {

        }

    return s.replaceAll(c, "(" + c + ")");
}
}



