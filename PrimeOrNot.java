import java.util.Scanner;
public class PrimeOrNot{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert any number :");
        int number = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<number;i++){
            if(number%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
}

/*
OUTPUT:
C:\Users\HP\Desktop\Mycaptain\Mycaptain_Java>javac PrimeOrNot.java

C:\Users\HP\Desktop\Mycaptain\Mycaptain_Java>java PrimeOrNot
Please insert any number :3
3 is a prime number

C:\Users\HP\Desktop\Mycaptain\Mycaptain_Java>java PrimeOrNot
Please insert any number :9
9 is not a prime number
*?