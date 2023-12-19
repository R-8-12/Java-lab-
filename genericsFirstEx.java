public class genericsFirstEx{
    public <E> void printArray(E []s){
        for(E x:s){
            System.out.println(x);
        }
    }
	public static void main(String[] args) {
	    genericsFirstEx g=new genericsFirstEx();
	    String s1[]=new String[]{"cat","dog","cow"};
	    g.<String>printArray(s1);
	    Integer i[]={1,2,3,4,5};
	    g.<Integer>printArray(i);
	}
}
