//Name :-Aditya Sharma
//Roll No.-12
//Class:-CSIT-1
import java.util.*;
public class Prog18{ 
    static int x;
    public static void set(){ //setter
        System.out.print("Enter any number: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        x=n;
    }
    public static void get(){ //Getter
        System.out.println("The no. entered by the user is "+x);
    }
    public static void main(String[] args) {
        Prog18.set();
        Prog18.get();
    }
}
    

