import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int RanNum = random.nextInt(10)+1;
        int Guess = 0;
        boolean Done = false;
        String Trash = "";

        do
        {
            System.out.println("Guess the number between 1 and 10: ");
            if(in.hasNextInt())
            {
                Guess = in.nextInt();
                in.nextLine();
                if (Guess > 0 & Guess < 11)
                {
                    if(Guess == RanNum)
                    {
                        System.out.println("You guessed the number!");
                        Done = true;
                    }
                    else if(Guess > RanNum)
                    {
                        System.out.println("Your guess is " + (Guess - RanNum) + " over the number.");
                        Done = true;
                    }
                    else if(Guess < RanNum)
                    {
                        System.out.println("Your guess is " + (RanNum - Guess) + " under the number.");
                        Done = true;
                    }
                }
            }
            else
            {
                Trash = in.next();
                System.out.println("You entered " + Trash + " which is invalid.");
                System.out.println();
                in.nextLine();
            }
        }while(!Done);
    }
}