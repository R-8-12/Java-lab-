//Name :-Aditya Sharma
//Roll No.-12
//Class:-CSIT-1

public class Prog16{ 
    static int x;
    Prog16(int i){ //setter
        x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        Prog16 obj=new Prog16(100);
        Prog16.get();
    }
}
    

