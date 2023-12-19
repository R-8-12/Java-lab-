public class genericsRequirement{
    public void printArray(String []s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
	public static void main(String[] args) {
	    genericsRequirement g=new genericsRequirement();
	    String s1[]=new String[]{"cat","dog","cow"};
	    g.printArray(s1);
	}
}
