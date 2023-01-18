package class11;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 45, 60, 13, 11};
        /*arr[5]=0;*/    //this is how  we replace value of a single element in an array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);

            }
        }
    }
