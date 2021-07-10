import java.util.*;
public class SwitchCase{
    public static void main(String []args)
    {
        System.out.println("\n1.Pizza\n2.Burger\n3.French Fries\n4.Milkshake\n");
        Scanner s=new Scanner(System.in);
		int choice;
        System.out.println("Enter your Choice:");
		choice=s.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Item : Pizza");
                System.out.println("Price : Rs.250");
                break;

            case 2:
                System.out.println("Item : Burger");
                System.out.println("Price : Rs.150");
                break;

            case 3:
                System.out.println("Item : French Fries");
                System.out.println("Price : Rs.80");
                break;

            case 4:
                System.out.println("Item : Milkshake");
                System.out.println("Price : Rs.180");
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
/*
C:\Users\HP\Desktop\Mycaptain_Java>javac SwitchCase.java

C:\Users\HP\Desktop\Mycaptain_Java>java SwitchCase

1.Pizza
2.Burger
3.French Fries
4.Milkshake

Enter your Choice:
4
Item : Milkshake
Price : Rs.180
*/