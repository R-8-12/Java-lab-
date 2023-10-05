import java.util.*;
public class TwoDStrArr
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m,n;
	    System.out.print("Enter the rows of an array:    ");
	    m=sc.nextInt();
	    System.out.print("Enter the columns of an array:    ");
	    n=sc.nextInt(); 
	    String s[][]=new String[m][n];
	    System.out.print("Enter String:   ");
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            s[i][j]=sc.next();
	        }
	        System.out.println();
	    }
	    for(String []k:s){
	        for(String val:k){
	            	System.out.print(val+"\t");
	        }
	        System.out.println();
	    }
	}
}
