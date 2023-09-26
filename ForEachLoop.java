//wap to demonstrate for each loop using arrays.
import java.util.*;
public class ForEachLoop{
	public static void main(String[] args){
	    int n;
	    Scanner sc=new Scanner(System.in);
	    //System.out.print("Enter the range of an array:    ");
	    //n=sc.nextInt();
	    int age[]=new int[]{1,2,3};
	    System.out.print(age.length);
	    for(int a:age){
	        System.out.print(a+" ");
	    }
	}
}