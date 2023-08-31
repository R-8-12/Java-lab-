/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
 class Calci
{   
    private int i;
    private int j;
    Calci(int x,int y){
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
}
    public class A{
        public static void main(String[] args){
            Calci c=new Calci(3,4);
            c.add();
            c.sub();
            c.mult();
        }    
    }

