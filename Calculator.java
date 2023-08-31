/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12
import java.util.*;
class Calculator
{   
    private int i;
    private int j;
    Calculator(int x,int y){
        i=x;
        j=y;
    }
    public void add(){
        System.out.println("The sum of number assessed is "+(i+j));
    }
    public void sub(){
        System.out.println("The subraction of number assessed is "+(i-j));
    }
    public void mult(){
        System.out.println("The multiplication of number assessed is "+(i*j));
    }
    public void div(){
        System.out.println("The division of number assessed is "+(i/j));
    }
        public static void main(String[] args){
            System.out.print("Enter any two operands:   ");
            Scanner r=new Scanner(System.in);
            int n1=r.nextInt();
            int n2=r.nextInt();
            Calculator c=new Calculator(n1,n2);
            c.add();
            c.sub();
            c.mult();
            c.div();
        }    
    }
