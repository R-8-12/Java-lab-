//Try Catch block
import java.util.*;
public class CatchBlockwWithMultipleExceptions
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    try{
        int n=Integer.parseInt(sc.nextLine());
        if(99%n==0){
            System.out.println(n+" is a factor of 99");
        }
    }
    catch(ArithmeticException | NumberFormatException e){
        System.out.println("Exception encountered"+e.getMessage());
    }
}
}