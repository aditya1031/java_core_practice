import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        int age;
        String name;
        Boolean isStudent;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your name :");
        name = sc.nextLine();

        System.out.print("Enter your age : ");
        age = sc.nextInt();

        System.out.println("Are you a student (ture/false)");
        isStudent = sc.nextBoolean();

        if (name.isEmpty()) {
            System.out.println("you didn't' enter your name!");
        } else {
            System.out.println("Hello " + name + "!");
        }

        if (age >= 65) {
            System.out.println("you are a senior citizen!");
        } else if (age < 0) {
            System.out.println("invalid entry!");
        } else if (age == 0) {
            System.out.println("your are a baby!");
        } else if (age >= 18) {
            System.out.println("you are an adult!");
        } else {
            System.out.println("you are a minor!");
        }

        if (isStudent) {
            System.out.println("you are a student");
        } else {
            System.out.println("you are not a student");
        }

        sc.close();
    }
}
