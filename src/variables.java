public class variables {
    static void main(String[] args) {
        //int = integer
        int a = 23;
        int b = 66;
        int sum = a + b;
        System.out.println("the sum is  : " + sum);

        //double= decimal numbers

        double price = 19.99;
        double gpa = 7.66;
        double temp = 34.7;

        System.out.println("The price of pizza is :" + price + "$");
        System.out.println("I got " + gpa + " gpa in my collage");
        System.out.println("Today the temperature is " + temp + " degree Celsius");

        char grade = 'A';
        char symbol='!';
        char currency='$';

        boolean isStudent=true;
        boolean forSale=false;
        boolean inOnline=true;

        System.out.println(isStudent);

        if(isStudent)
        {
            System.out.println("You are a student");
        }
        else{
            System.out.println("you are not a student");
        }


        String name="aditya kumar";
        System.out.println("hello"+name);

        String food="pizza";
        System.out.println("your fav food is "+food);

        String email="fake12324@email.com";
        System.out.println(email);


    }
}
