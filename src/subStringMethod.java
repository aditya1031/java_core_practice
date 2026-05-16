import java.util.Scanner;

public class subStringMethod {
    public static void main(String[] args) {
        String email;
        String username;
        String domain;

        Scanner sc = new Scanner((System.in));

        System.out.println("Enter your email");
        email = sc.nextLine();

        if (email.contains("@")) {

            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1, email.length());

            System.out.println("user UserName is " + username);
            System.out.println("user Domain is " + domain);
        }
        else{
            System.out.println("email not valid ,must have '@' (xyz123@email.com)");
        }


    }
}
