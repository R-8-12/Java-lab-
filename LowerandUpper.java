//To display the name either in uppercase or in lower case as per the user choice.
import java.util.*;
public class LowerandUpper{
    public static void main(String[] args){
        String s1="Your Name";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Choice 0 or 1:  ");
        int choice=sc.nextInt();
        switch(choice){
            case 0:
                System.out.println(s1.toLowerCase());
                break;
            case 1:
                System.out.println(s1.toUpperCase());
                break;
        }
    }
}