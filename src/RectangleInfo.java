import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Width = 0;
        double Height = 0;
        boolean Done = false;
        String Trash = "";

        do
        {
            System.out.println("Enter the width: ");
            if(in.hasNextDouble())
            {
                Width = in.nextDouble();
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
            System.out.println("Enter the height: ");
            if(in.hasNextDouble())
            {
                Height = in.nextDouble();
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
        System.out.println("The area of the rectangle is " + (Width * Height) + " and the perimeter is " + (Width*2 + Height*2));
        System.out.println("The length of the diagonal is " + Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2)));
    }
}