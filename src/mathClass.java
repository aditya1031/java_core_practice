import java.util.Scanner;

public class mathClass {

    public static void main(String[] args) {
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//        result = Math.pow(2, 5);
//
//        System.out.println(result);
//
//        System.out.println(Math.abs(-1));
//
//        result = Math.sqrt(9);
//
//        result = Math.round(5.12);
//        result = Math.ceil(4.15);
//        result = Math.floor(5.89);
//        result= Math.max(3,4);
//        result= Math.min(3,4);
//
//        System.out.println(result);


        System.out.println("calculate Hypotenuse: ");
        //HYPOTENUSE c= Math.sqrt(a²+b²)

        Scanner sc = new Scanner(System.in);

        double a,b,c;

        System.out.println("Enter the length of side A : ");
        a=sc.nextDouble();

        System.out.println("Enter the length of side B : ");
        b=sc.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.printf("The hypotenuse (side C) is %.1fcm", c);
        sc.close();

    }
}

