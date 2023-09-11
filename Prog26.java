class Prog26{
  int length;
  int breadth;
  public Prog26(int l, int b){
    length = l;
    breadth = b;
  }
  public int getArea(){
    return length*breadth;
  }
  public int getPerimeter(){
    return 2*(length+breadth);
  }
  public static void main(String[] args){
    Prog26 a = new Prog26(4,5);
    Prog26 b = new Prog26(5,8);
    System.out.println("Area : "+a.getArea()+" Perimeter : "+a.getPerimeter());
    System.out.println("Area : "+b.getArea()+" Perimeter : "+b.getPerimeter());
  }
}