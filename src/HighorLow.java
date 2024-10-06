import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int RanNum = 0;
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
                if(Guess >=)
                {

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