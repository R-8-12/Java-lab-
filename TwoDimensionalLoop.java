import java.util.*;
public class TwoDimensionalLoop{
    public static void main(String[]args){
        int n,m,val;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:  ");
        m=sc.nextInt();
        System.out.println("Enter the no. of columns:   ");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("ENTER THE ELEMENTS:  ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
        }
        System.out.println();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
        }
        System.out.println();
        }
    }
}                                                                                              