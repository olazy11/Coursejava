package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "files/config.pr.properties";
        FileOutputStream fileOutputStream = new FileOutputStream(path);//to write data to a file
        Properties properties = new Properties();
        properties.setProperty("Name","Anees");
        properties.store(fileOutputStream,"A new name has been added");//method to write the data to disk
    }
}
