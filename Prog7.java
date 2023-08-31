
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12
//7.Sum of Natural NUmbers
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
