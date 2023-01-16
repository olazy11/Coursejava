package class10;
//10 20 30 45 50
public class Arrays3 {
    public static void main(String[] args) {
        int [] numbers ={10,20,30,45,50};
        int sum =0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum+numbers[i];}
            System.out.println(numbers[sum]);

        }
    }

 /*10 20 30 45 50
         int [] numbers={10,20,30,45,50};

         // Write code to add all the numbers from an array
         int sum=0;
         for (int i = 0; i < numbers.length; i++) {
        sum=sum+numbers[i]; // adding all the numbers
        }
        System.out.println(sum);*/