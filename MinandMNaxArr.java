//Create an +ve integer array and print the count of even and odd no.'s in ana array.
import java.util.*;
public class MinandMNaxArr{
	public static void main(String[] args){
	    int s=0,l=0;
	    int a[]={12,45,67,34};
	    for(int i=0;i<4;i++){
	        if(a[i]%2==0){
	            s+=1;
	        }
	        else{
	            l+=1;
	        }
	    }
	    System.out.println("No. of Odd no. = "+s);
	    System.out.println("No. of Even no.= "+l);
	}
}