//WAP to printmin and max element of the given array.
public class ArrayStrPrint{
	public static void main(String[] args){
	    int s=0;
	    int a[]={12,45,67,34};
	    System.out.println("Integer array is"+Arrays.toString(a)+" ");
	    Arrays.sort(a);
	    System.out.println("Sorted integer array is"+Arrays.toString(a)+" ");
	    System.out.println("Maximum = "+a[0]);
	    System.out.println("Minimum = "+a[3]);
	}
}
