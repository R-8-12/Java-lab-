class toString{
    int rollno;
    String name;
    String city;
    
toString(int rollno,String name,String city){
    this.rollno = rollno;
    this.name = name; 
    this.city= city;
}
public String toString(){
    return rollno+" "+name+" "+city;
}
public static void main(String args[]){
    toString s1=new toString(101,"Raj","Lucknow");
    toString s2=new toString(102,"Vijay","Ghaziabad");
    System.out.println(s1);
    System.out.println(s2);
} 
}