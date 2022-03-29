import java.io.*;
import java.util.Scanner;

class player
{  
    static int add(int a)
    {
        return a;
    }  
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }  
}  

class average
{   
        public static void main(String[] args)
        {  
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the runs scored by the player: ");
            int runs = scan.nextInt();
            System.out.print(runs);  
        }
}