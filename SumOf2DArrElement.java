import java.util.*;
public class SumOf2DArrElement
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the row of an array:    ");
	    int m=sc.nextInt();
	    System.out.print("Enter the columns of an array:    ");
	    int n=sc.nextInt();
	    int s[][]=new int[m][n];
	    int t=0;
	    System.out.println("Enter elements: ");
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	        s[i][j]=sc.nextInt();
	    }
	   System.out.println(); 
	}
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	        t+=s[i][j];
	    }
	    System.out.println();
	}
	    System.out.println("Sum of elements=    "+t);
	    }
}
	    
    	        