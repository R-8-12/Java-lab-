import java.util.*;
class Table extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }
}
public class SimultaneousTablesbyThread{
	public static void main(String[] args){ 
		Table t=new Table();
		Table s=new Table();
		t.start();
		s.start();
	}
}
