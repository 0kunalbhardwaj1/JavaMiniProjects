import java.util.Scanner;

class student{
    private String userName;
    private String userPassword;

    public student(){
        this.userName = null;
        this.userPassword = null;
    }

    public student(String userName, String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public void login(String userName, String userPassword){
        if((this.userPassword.equals(userPassword)) && (this.userName.toLowerCase().equals(userName.toLowerCase()))){
            System.out.println("Access Granted");
        }
        else System.out.println("Access Denied, recheck your credentials");
    }
}
public class studentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        student SID = new student("KUNAL", "aHsdwSilpGTYVVjd");

        System.out.println("Please enter your Username: ");
        String userName = sc.nextLine();
        System.out.println("Please enter your Userpassword: ");
        String userPassword = sc.nextLine();

        SID.login(userName, userPassword);

        sc.close();
    }
}
