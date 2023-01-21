package Class12.Homework;
/*
* Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific  attributes and behaviors.
* */
public class Dog {
    String breed;
    int age;
    String color;
    String voice;
    String children;
    void bark() {
        System.out.println("Dog " + breed+ " has" + voice+ "barking sound");
    }
    void playWithChildreb() {
        System.out.println("Dog "+ breed + "is"+ children + " with children");}


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.age =7;
        dog1.breed ="Husky";
        dog1.color ="white";
        dog1.voice = "pleasant";
        dog1.children ="very good";
        dog1.playWithChildreb();
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.age =4;
        dog2.breed ="Bulldog";
        dog2.color ="black";
        dog2.voice = "scary";
        dog2.children ="quite good";
        dog2.bark();
        dog2.playWithChildreb();

        Dog dog3 = new Dog();
        dog3.age =2;
        dog3.breed ="Labrador";
        dog3.color ="gray";
        dog3.voice = "nice";
        dog3.children ="is good";
        dog3.bark();
        dog3.bark();
    }



}
