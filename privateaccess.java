class Data{
    private String name;
    public void setter(String s){
        name=s;
    }
    public String getter(){
        return name;
    }
}
public class privateaccess{
    public static void main(String[] main){
        Data d=new Data();
        d.setter("Java");
        System.out.println(d.getter());
    }
}