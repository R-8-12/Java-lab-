//Try Catch block
import java.util.*;
public class MultipleCatch_NumberFormatException
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    try{
        int n=Integer.parseInt(sc.nextLine());
        if(99%n==0){
            System.out.println(n+" is a factor of 99");
    }
    }
    catch(ArithmeticException e){
        System.out.println("ArithematicException=>"+e.getMessage());
    }
    catch(NumberFormatException e){
        System.out.println("Number Format Exception"+e.getMessage());
    }
}
}