package Class6.Homework;

import java.util.Scanner;

/*
* Write a program that will read three inputs of scores (quiz, mid term, and final scores) and
* determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
*/
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your score: quiz, midterm or final score");
        double quiz = input.nextDouble();
        double midTerm = input.nextDouble();
        double finscore = input.nextDouble();
        double average = (quiz + midTerm + finscore)/3;

        if (average >= 90) {
            System.out.println("Your grade is A");}
            if (average >= 70 && average < 90) {
                System.out.println("Your grade is B");}
                if (average >= 50 && average < 70) {
                    System.out.println("Your grade is C");}
                    if (average < 50) {
                        System.out.println("Your grade is F");
                    }
                }
            }




