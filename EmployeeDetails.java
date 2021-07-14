import java.util.Scanner;

class Employee {
    String name;
    int year;
    String addr;

}

class EmployeeDetails {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees:");
        int k = sc.nextInt();

        Employee emp[] = new Employee[k];

        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();

            System.out.println("Enter " + (i + 1) + " Employee data :");

            System.out.print("Enter employee name :");
            emp[i].name = sc.next();

            System.out.print("Enter year of joining :");
            emp[i].year = sc.nextInt();
            
            System.out.print("Enter address :");
            emp[i].addr = sc.next();

        }

        System.out.println("\n\n============ All employee details are :============\n");

        System.out.println("NAME \tYEAR OF JOINING  \tADDRESS :");
        for (int i = 0; i < k; i++) {
            System.out.println( emp[i].name + " \t" + emp[0].year + " \t\t\t" + emp[i].addr);

        }
    }

}
/*
C:\Users\HP\Desktop\Mycaptain\Mycaptain_Java>javac EmployeeDetails.java

C:\Users\HP\Desktop\Mycaptain\Mycaptain_Java>java EmployeeDetails
Enter the number of employees:3
Enter 1 Employee data :
Enter employee name :Robert
Enter year of joining :1994
Enter address :64C-WallsStreet
Enter 2 Employee data :
Enter employee name :Sam
Enter year of joining :2000
Enter address :68D-WallsStreet
Enter 3 Employee data :
Enter employee name :John
Enter year of joining :1999
Enter address :26C-WallsStreet


============ All employee details are :============

NAME    YEAR OF JOINING         ADDRESS :
Robert  1994                    64C-WallsStreet
Sam     1994                    68D-WallsStreet
John    1994                    26C-WallsStreet
*/