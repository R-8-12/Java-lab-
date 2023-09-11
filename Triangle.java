//Q.25
public class Triangle{ 
 int a,b,c;
  public double getArea(){
    double s = (a+b+c)/2.0;
    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
  }
  public double getPerimeter(){
    return (a+b+c);
  }
  public static void main(String[] args){
    Triangle t = new Triangle();
    t.a = 2;
    t.b = 5;
    t.c = 6;
    System.out.println("The area of triangle with given sides is "+t.getArea());
    System.out.println("The perimeter of triangle with given sides is "+t.getPerimeter());
  }
}
