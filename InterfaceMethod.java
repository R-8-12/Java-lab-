 interface solution{
    public void Hello();
    public void Welcome();
 }

public class InterfaceMethod implements solution{
    public void Hello(){
        java.lang.System.out.println("Hello World");
    }
    public void Welcome(){
       java.lang.System.out.println("Welcome to Edureka"); 
    }
 
 public static void main(String[] args){
     InterfaceMethod a=new InterfaceMethod();
     a.Hello();
     a.Welcome();
 }
 }