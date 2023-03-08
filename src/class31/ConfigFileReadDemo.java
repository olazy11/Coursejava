package class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReadDemo {
    public static void main(String[] args) throws IOException {
        String path = "files/config.properties";
        FileInputStream fileInputStream =new FileInputStream(path);//to read
        Properties properties = new Properties(); //assist in reading and writing .properties files
        properties.load(fileInputStream);//loads all the data from file inside the above object 'properties'(child class of a map)
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        System.out.println(properties.get("browser"));


    }
}
