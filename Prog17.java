//Name :-Aditya Sharma
//Roll No.-12
//Class:-CSIT-1

public class Prog17{ 
    static int x;
    Prog17(int i){ //setter
        x=i;
    }
    public static void get(){ //Getter
        System.out.println(x);
    }
    public static void main(String[] args) {
        Prog17 obj=new Prog17(100);
        Prog17.get();
    }
}
    

