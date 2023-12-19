class Mydata<E>{
    E i;
    public void set(E i1){
        i=i1;
    }
    public E get(){
        return i;
    }
}
public class GenericsMydata{
	public static void main(String[] args) {
		Mydata <Integer>n=new Mydata<Integer>();
		Mydata <String>n1=new Mydata<String>();
		Integer k=new Integer(5);
		n.set(k);
		System.out.println(n.get());
		n1.set("Rohit");
		n1.get();
		System.out.println(n1.get());
	}
}
