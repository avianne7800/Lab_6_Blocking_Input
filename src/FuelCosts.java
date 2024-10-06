import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double GInTank = 0;
        double MilesPerG = 0;
        double PricePerG = 0;
        boolean Done = false;
        String Trash = "";

        do
        {
            System.out.println("Enter the number of gallons in the tank: ");
            if(in.hasNextDouble())
            {
                GInTank = in.nextDouble();
                in.nextLine();
                Done = true;
            }
            else
            {
                Trash = in.next();
                System.out.println("You entered " + Trash + " which is invalid.");
                System.out.println();
                in.nextLine();
            }
        }while(!Done);
        Done = false;
        do
        {
            System.out.println("Enter the number of gallons in the tank: ");
            if(in.hasNextDouble())
            {
                MilesPerG = in.nextDouble();
                in.nextLine();
                Done = true;
            }
            else
            {
                Trash = in.next();
                System.out.println("You entered " + Trash + " which is invalid.");
                System.out.println();
                in.nextLine();
            }
        }while(!Done);
        Done = false;
        do
        {
            System.out.println("Enter the number of gallons in the tank: ");
            if(in.hasNextDouble())
            {
                PricePerG = in.nextDouble();
                in.nextLine();
                Done = true;
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