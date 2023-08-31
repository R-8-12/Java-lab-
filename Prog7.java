
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12
//1.Print an integer entered by the user.
import java.util.*;
public class Prog7{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.print("Enter any number:  ");
        int n=r.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.print("The sum of numbers is "+sum);
    }
}