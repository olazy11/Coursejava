package class4;

public class NestedIf4 {
    public static void main(String[] args) {

        boolean studyHard =true;
        int salary =90000;

        if (studyHard){
            System.out.println("We get the jobs");//only and only if we get the job,we can buy

            if (salary>100000) {
                System.out.println("Lets buy Tesla");
            }else{ //is executed only if the above line is false
                System.out.println("lets buy Toyota");
            }

        }else{
            System.out.println("It might take a little longer for us to get the jobs");
        }
    }
}
