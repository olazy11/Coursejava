package class18;

public class Student {
    String ID;
    String  name;
    double weight;
    int age;


    public Student(String stName, String stId, int
            stAge, double stWeight){
        name=stName;
        ID = stId;
        age=stAge;
        weight=stWeight;
    }
    public Student(String stName, String stId){
        name=stName;
        ID = stId;

    }

    void printInfo(){
        System.out.println("Name "+name+" ID "+ID
                +" age "+age+ " Weight "+weight);
    }

}


