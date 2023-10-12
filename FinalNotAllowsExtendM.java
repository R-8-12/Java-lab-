//create a final class
final class FinalClass
{
    public void display(){
        System.out.println("This is final method.");
    }
}//try to extend the final class
class FinalNotAllowsExtendM extends FinalClass{
    public final void display(){
        System.out.println("The final method is overridden.");
    }

	public static void main(String[] args) {
        Main obj=new Main();
        obj.display;
	}
}
