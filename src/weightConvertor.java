import java.util.Scanner;

public class weightConvertor {

    public static void main(String[] args) {

        //WEIGHT CONVERSION PROGRAM

        //Declare variables
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        //Welcome message
        System.out.println("Weight conversion Program");

        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");


        //Prompt for user choice
        System.out.println("Enter your choice");
        choice = sc.nextInt();


        //Option 1 convert lbs to kgs
        if (choice == 1) {
            System.out.println("Enter your weight in lbs");
            weight = sc.nextDouble();

            newWeight=weight*0.453592;
            System.out.printf("The new new weight in kgs is:  %.3fkg",newWeight);

        }
        //Option 2 convert kgs to lbs
        else if (choice == 2) {
            System.out.println("Enter your weight in kgs");
            weight = sc.nextDouble();

            newWeight=weight*2.20462;
            System.out.printf("The new new weight in lbs is: %.3flbs",newWeight);

        }
        //Else print not valid choice
        else {
            System.out.println("Wrong choice !!");
        }

        sc.close();
    }
}
