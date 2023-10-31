public class ThreadbyImplementmethod implements Runnable
{
	public static void main(String[] args){
	    ThreadbyImplementmethod s=new ThreadbyImplementmethod();
	    Thread t=new Thread(s);
	    t.start();
	    System.out.println("This code is outside of the thread.");
	}
    public void run(){
		System.out.println("This code is running in a thread.");
	}
}

