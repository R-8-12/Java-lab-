//Try Catch block
public class CatchBlock_ArrOutOfBoundsAndNullPointerException
{
	public static void main(String[] args) {
    String s=null;
    int arr[]={10,20,30};
    try{
        System.out.println(arr[3]);
        System.out.println(s.length());
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception Index Out of Bounds : "+e.getMessage());
    }
    catch(NullPointerException e){
        System.out.println("Exception Null pointer  :   "+e.getMessage());
    }
}
}