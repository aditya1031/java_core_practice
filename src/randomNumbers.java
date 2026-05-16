import java.util.Random;

public class randomNumbers {

   public static void main(String[] args) {

       Random rnd=new Random();
       int num;

       double numb;
       numb= rnd.nextDouble();

       boolean  coin;
       coin=rnd.nextBoolean();

       num= rnd.nextInt(1,9);

       System.out.println(numb);

       if(coin)
       {
           System.out.println("HEADS");
       }else {
           System.out.println("TAILS");
       }

    }

}
