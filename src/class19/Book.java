package class19;
/*
*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
* */
public class Book {
    String author;
    String title;
    int year;

    Book(String author,String title){
        this.author=author;
        this.title=title;
    }
    Book(String author,String title,int year){
        this(author,title);
        this.year=year;
    }
    void info(){
        System.out.println("Author:"+author+", Title: "+title+", published: "+year);
    }

    public static void main(String[] args) {

        Book book =new Book("Judy Kerolus", "Java Priciples", 2023 );
        book.info();
    }
}


