package Reptlits;

public class Array {public static void main(String[] args) {
    int[][] a = {
            {1, 1, 2}, //sum = 4
            {3, 1, 2}, //sum = 6
            {3, 5, 3}, //sum = 11
            {0, 1, 2}, //sum = 3
    };


    int[] result = new int[a.length];
    int total;

    //Loop over the first dimension
    for (int i = 0; i < a.length; i++) {

        total = 0;//Make sure to re-initialize the total in each iteration

        //For each row calculate the sum and store it in total
        for (int k = 0; k < a[i].length; k++) {
            total += a[i][k];
        }

        //When you finish put the result of each row in result[i]
        result[i] = total;
        System.out.println(total);
    }

    return ;
}


}





