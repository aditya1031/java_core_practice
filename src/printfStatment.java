public class printfStatment {
    public static void main(String[] args) {


        String name = "aditya";
        char firstLetter = 'A';
        int age = 23;
        double height = 5.11;
        boolean isEmployed = false;

        //printf() = is a method used to format output
        //%[flags][width][.precision ][specifier-character]
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name start with a %c\n", firstLetter);
        System.out.printf("you are %d\n", age);
        System.out.printf("your height %.2f ft\n", height);

        System.out.printf("you are currently employed %b\n", isEmployed);
        System.out.printf("%s is %d years old\n ", name, age);


        //PRECISION
        double price1 = 90.99;
        double price2 = 100000.12;
        double price3 = -54.01;

        System.out.printf("%,+.2f\n", price1);
        System.out.printf("%,+.2f\n", price2);
        System.out.printf("% .2f\n", price3);

        //width

        int id1=1;
        int id2=12;
        int id3=123;
        int id4=1234;

        System.out.printf("%04d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("-4d\n",id3);
        System.out.printf("%04d\n",id4);
    }
}
