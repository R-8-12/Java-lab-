class Table extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(2+" X "+i+" = "+i*2);
        }
    }
}
public class TableOf2byThread{
	public static void main(String[] args) {
		Table t=new Table();
		Table s=new Table();
		t.start();
		s.start();
	}
}
