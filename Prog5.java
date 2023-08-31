
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12
//1.Print an integer entered by the user.
import java.util.*;
public class Prog5{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.print("Enter any Character:  ");
        char c= r.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
           System.out.println("The entered character is vowel.");
         else
          System.out.println("The entered character is consonant.");
          
    }
}