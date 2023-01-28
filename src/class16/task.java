package class16;
/*Create a method createEmail(). Based on values of users name, lastName and email type,
your method should return complete email Address. Example:  createEmail(John, Snow, gmail)
→ johnsnow@gmail.com or


* */
public class task {
    String createEmail(String name, String lastname, String emailtype) {
        String fullEmail = name + lastname + "@" + emailtype + ".com";
        return fullEmail.toLowerCase();
    }

    public static void main(String[] args) {
        task mp = new task();
        System.out.println(mp.createEmail("John", "Snow","gmail"));
    }
}