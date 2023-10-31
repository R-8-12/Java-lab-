class ThreadCount extends Thread{
        ThreadCount(String s){
            super(s);
            System.out.println("New thread created"+this);
            start();
        }
    public void run(){
        try{
		    for(int i=0;i<10;i++){
		        System.out.println("New thread created"+this);
		        Thread.sleep(1500);
		    }
	}
	catch(Exception e){
	    System.out.println("Currently executing thread is interrupted.");
	}
	System.out.println("Currently executingthread run is terminated.");
    }
}
public class ThreadCountusingconstructor{
	public static void main(String[] args){ 
		ThreadCount t=new ThreadCount("Hello");
		ThreadCount s=new ThreadCount("Hello");
		t.start();
		s.start();
	}
}
