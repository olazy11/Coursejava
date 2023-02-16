package class24;

public class FileTester {
    public static void main(String[] args) {
        File [] ft ={new JavaFile(12), new WordFile(10),new PDFFile(5)};
        /*for (File f: ft) */
        for (int i = 0; i < ft.length; i++) {
            File f = ft [i];
            f.open();
            f.edit();
            f.close();
        }
    }
}
