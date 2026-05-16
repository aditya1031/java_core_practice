import java.util.Scanner;

public class compoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int time;

        double amount;

        System.out.println("Enter the principle amount: ");
        principal = sc.nextDouble();

        System.out.println("Enter the interest rate (%) :");
        rate = sc.nextDouble() / 100;

        System.out.println("Enter the time compounded  per year: ");
        timeCompounded = sc.nextInt();

        System.out.println("enter the number of years: ");
        time = sc.nextInt();
        ;

        amount = principal * Math.pow((1 + rate / timeCompounded), timeCompounded * time);

//        System.out.println("The amount after " + time + " is : $" + amount);
        System.out.printf("The amount after %d years is %.2frupee" ,time,amount);
        sc.close();
    }

}
