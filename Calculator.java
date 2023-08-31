/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//Name:-Aditya Sharma
//Class- CSIT-1
//Roll No.-12
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
        public static void main(String[] args){
            Calculator c=new Calculator(3,4);
            c.add();
            c.sub();
            c.mult();
        }    
    }
