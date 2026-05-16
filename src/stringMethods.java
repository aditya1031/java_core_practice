import java.util.Locale;

public class stringMethods {

    public static void main(String[] args) {
        String name = "    Aditya Kumar    ";

        int length = name.length();
        char ch = name.charAt(2);

        int index = name.indexOf("y");
        int indexLast = name.lastIndexOf("a");


//        name = name.toLowerCase();
//        name = name.toUpperCase();

        name = name.trim();

        name = name.replace("a", "A");

//        System.out.println(name.isEmpty());

//        if(name.contains(" "))
//        {
//            System.out.println("your name contains a space");
//        }
//        else{
//            System.out.println("you name does not contains space");
//        }

        name="password";
        if(name.equalsIgnoreCase("passWord"))
        {
            System.out.println("your name can't be password");
        }
        else{
            System.out.println("password set correctly");
        }






        System.out.println(name);

    }
}
