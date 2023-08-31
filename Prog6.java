
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12
//1.Print an integer entered by the user.
import java.util.*;
public class Prog6{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.print("Enter any number:  ");
        int c=r.nextInt();
        if(c>0){
           System.out.println("The entered number is positive.");
        }
        else if(c<0){
            System.out.println("The entered number is negative.");
        }
        else{
          System.out.println("The entered number is zero, Kindly assign some valuable entity to the variable.");
        }  
    }
}