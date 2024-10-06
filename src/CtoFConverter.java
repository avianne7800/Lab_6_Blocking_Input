import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double CInput = 0;
        double FOutput = 0;
        boolean Done = false;
        String Trash = "";

        do
        {
            System.out.println("Enter temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                CInput = in.nextDouble();
                in.nextLine();
                FOutput = CInput * (1.8) + 32;
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

        System.out.println(CInput + " in Fahrenheit is " + FOutput);
    }
}