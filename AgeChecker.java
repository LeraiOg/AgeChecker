import java.util.*;

public class AgeChecker {

    public static void main(String[] args) {
        
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = keyboard.nextInt();
        if(age < 18)
        {
          System.out.print("You are not allowed to drive");
        }
        else
        {
            System.out.println("You are allowed you drive");
        }



    }
}