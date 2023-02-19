package groupProject;

public abstract class Marks {

abstract double getPercentage () ;}
class A extends Marks {
    double subject1;
    double subject2;
    double subject3;
    double maxTotalOfGrades;

    public A(double subject1, double subject2, double subject3 ) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;    }

    @Override
    double getPercentage() {
        maxTotalOfGrades = 3*5;
        return ((subject1+subject2+subject3)/3)*100/maxTotalOfGrades;   }}
class B extends Marks {
    double subject1;
    double subject2;
    double subject3;
    double subject4;
    double maxTotalOfGrades;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;    }
    @Override
    double getPercentage() {
        maxTotalOfGrades = 4*5;
        return ((subject1+subject2+subject3+subject4)/4)*100/maxTotalOfGrades;

    }
}


