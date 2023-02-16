package class24;

public abstract class File {
    int size;
    File (int size) {
        size = this.size;}

    public abstract void open ();
    public void edit () {
        System.out.println("editing the file");
    }
    public void close () {
            System.out.println("closing the file");   }    }

class JavaFile extends File {
    JavaFile (int size){
    super(size);}

    @Override
        public void open() {
            System.out.println("Opening in Intellij");    }
        @Override
        public void edit() {
            System.out.println("Editing in Intellij");
        }
    }

class WordFile extends File {
    WordFile (int size) {
        super(size);}

        @Override
        public void open() {
            System.out.println("Opens in Microsoft");     }     }
    class PDFFile extends File {
    PDFFile (int size){
        super(size);
    }
        @Override
        public void open() {
            System.out.println("Opens in Adobe reader");    }    }


