class MultithreadingDemo implements Runnable
{
    public void run(){
        try{
		System.out.println("Thread "+Thread.currentThread().getId()+" is running by Java");
	}
	catch(Exception e){
	    System.out.println("Exception is caught here.");
	}
    }
}
public class Multithreadrunning{ 
	public static void main(String[] args){
	    int n=8;
	    for(int i=0;i<n;i++){
	       Thread object=new Thread(new MultithreadingDemo());
	       object.start();
	   }
	}
    
}

