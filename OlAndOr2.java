//Create a parent class shape with two methods area and parameter.
class shape{
    public void area(){
        System.out.println("I'm in the parent class.");
    }
    void perimeter(int num){
        System.out.println("I'm int the parent class."+num);
    }
}
class circle extends shape{
    public void area(){
        System.out.println("Circle Area");
    }
    public void perimeter(int r){
        System.out.println("Circle Perimeter=   "+(2*3.14*r));
    }
}
class square extends shape{
    public void area(){
        System.out.println("Square Area");
    }
    public void perimeter(int s){
        System.out.println("Square Perimeter=   "+(s*s));  
    }
}
class OlAndOr2{
    public static void main(String[] args){
        shape sObj=new shape();
        circle cObj=new circle();
        square sqObj=new square();
        //OVER writing
        sObj.area();
        cObj.area();
        sqObj.area();
        //Over loading
        sObj.perimeter(1);
        cObj.perimeter(2);
        sqObj.perimeter(3);
    }
}