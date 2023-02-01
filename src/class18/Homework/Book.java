package class18.Homework;
/*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
* */
public class Book {
    String title;
    String author;
    int pages;

    Book (String a, String b, int c) {
        this.title = a;
        this.author =b;
        this.pages =c;
    }
void pintInfo () {
    System.out.println("The book's title is " + title + " is written by "+ author + " and has total of "+pages + " pages");
}
    public Book () {
        System.out.println("This a very interesting book");
    }


    public static void main(String[] args) {
        Book description = new Book ("Thunder", "Whatts",110);
        description.pintInfo();
        Book review = new Book();
    }
}
