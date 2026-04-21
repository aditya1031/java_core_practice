import java.util.Scanner;

public class Shopping_Cart {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.println("What item would you like to buy? :  ");
        item = sc.nextLine();
        System.out.println("What is the price for each? :  ");
        price = sc.nextDouble();
        System.out.println("What is the item quantity? :  ");
        quantity = sc.nextInt();
        total = quantity * price;
        System.out.println("Your total for " + quantity + " " + item + " is :  " + total);


        sc.close();
    }

}
