
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12

//9.Multiplication Table

import java.util.*;
public class Prog9{
    public static void main(String[] args) {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the integer:  ");
        int n=r.nextInt();
        int t=1;
        int f=1;
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
