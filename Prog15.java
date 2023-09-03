//Name :-Aditya Sharma
//Roll No.-12
//Class:-CSIT-1

public class Prog15{ 
    private static int x;
    Prog15(int i){ //setter
        this.x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        Prog15 obj=new Prog15(100);
        Prog15.get();
    }
}
    

