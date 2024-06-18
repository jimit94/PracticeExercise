import java.util.Objects;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     while (true){
         System.out.print("Please enter commamd : ");
         String data = input.next();
         if(data.equals("exit")){
             break;
         }
     }
        System.out.println("You've exited");

    }
}
