public class Threadconcept extends Thread
{
	public static void main(String[] args){
	    Threadconcept s=new Threadconcept();
	    s.start();
	    System.out.println("This code is outside of the thread.");
	}
    public void run(){
		System.out.println("This code is running in a thread.");
	}
}

