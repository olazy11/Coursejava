package class16.Homework;
/*6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
* */
public class Task6 {
    String getScore(int score){
        if((score>0)&&(score<=50)){
            return "your grade is F";
        } else if ((score>50)&&(score<=70)) {
            return "your grade is D";
        } else if ((score>70)&&(score<=80)) {
            return "Your grade is C";
        }else if ((score>80)&&(score<=90)){
            return "Your grade is B";
        }else if (score>90){
            return "Your grade is A";
        }
        return " false input";
    }
    public static void main(String[] args) {
        Task6 task6 =new Task6 ();
        System.out.println(task6.getScore(70));
    }
}
