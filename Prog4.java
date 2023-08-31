
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12
//1.Print an integer entered by the user.
import java.util.*;
class Prog4{
    public static void main(String[] args){
        System.out.print("Enter any number:   ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("The number entered is even.");    
        }
        else{
            System.out.println("The number entered is odd.");
        }
    }
}