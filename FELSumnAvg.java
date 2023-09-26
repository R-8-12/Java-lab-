//WAP to create an integer array calculate the sum average of  all the element in the array.
public class FELSumnAvg{
	public static void main(String[] args){
        int num[]=new int[]{10,9,6,5,4,3,2,1};
        int sum=0;
        double avg=0;
        for(int a:num){
            sum+=a;
            avg=(double)sum/(double)num.length;
            System.out.print(a+" ");
        }
        System.out.println("\n"+sum+"\n"+avg);
	}
}
	    
