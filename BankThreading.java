class banking{
    //static int TA=10000;
    public void withdraw(String s1,int n1,int a1){
        if(n1>a1){
            int w=n1-a1;
            System.out.println("Total amount=\t"+w);
        }
    }
    public void deposit(String s2,int n2,int a2){
        if(n2<a2){
            int d=n2+a2;
            System.out.println("Total amount=\t"+d);
        }
    }
}
class Thread1 extends Thread{
    banking t1=new banking();
    public void run(){
        t1.withdraw("ac100",10000,500);
    }
}
class Thread2 extends Thread{
    banking t1=new banking();
    public void run(){
        t1.deposit("ac100",9500,5000);
    }
}
public class BankThreading
{
	public static void main(String[] args) {
	Thread1 s1=new Thread1();
	Thread2 s2=new Thread2();
	s1.start();
	s2.start();	
	}
}

