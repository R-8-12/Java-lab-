class Parent{
    void display(){
        System.out.println("This is the parent class");
    }
    void show(int num){
        System.out.println("The no. in the parent classs is:"+num);
    }
}
class Child extends Parent{
    void display(){
        System.out.println("This is the child class.");
    }
    void show(double n){
       System.out.println("The no. in the parent classs is:"+n); 
    }
}
public class OverloadingAndOverriding{
    public static void main(String[] args){
        Parent parentObj=new Parent();
        Child childObj=new Child();
        
        //Method Overloading
        parentObj.show(5);  
        childObj.show(7.5);
        
        //Method Overriding
        parentObj.display();
        childObj.display();
    }
}