import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
//        String name= scanner.next();
//        System.out.println("hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your  GPA: ");
        double gpa = scanner.nextDouble();

        System.out.println("did you got the degree ?  (true/false)");
        boolean result = scanner.nextBoolean();

        System.out.println(name + "'s age is : " + age + ", and GPA is : " + age);
        if (result) {
            System.out.println("congrats!! you have completed your degree successfully.");
        } else {
            System.out.println("Sorry you have failed and need to redo the course!!");
        }
        scanner.close();
    }

}
