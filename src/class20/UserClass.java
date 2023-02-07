package class20;
/*userClass  that has a constructor that initializes instance variable name and mobile number.
        Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
        Print users name, mobile number and address in userDetails method. Test your code.*/
public class UserClass {
        String name;
    String cell;
        UserClass (String name, String cell) {
        this.name=name;
        this.cell = cell;}
    }
class UserInfo extends UserClass {
    String userAddress;

    UserInfo (String name,String cell,String userAddress) {
        super(name, cell);
        this.userAddress = userAddress; }
        void userDetails () {
            System.out.println("user " + " " + name + " "+ cell + " "+ userAddress);
        }
    }
class mTest {
    public static void main(String[] args) {

        UserInfo uI = new UserInfo("Olya", "192857", "Gagarina, 101");
        uI.userDetails();


    }
}

