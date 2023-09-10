class WrapperMarksheet{
    int rollno;
    String name;
    String city;
    
WrapperMarksheet(int rollno,String name,String city){
    this.rollno = rollno;
    this.name = name; 
    this.city= city;
}

public static void main(String args[]){
    WrapperMarksheet s1=new WrapperMarksheet(101,"Raj","Lucknow");
    WrapperMarksheet s2=new WrapperMarksheet(102,"Vijay","Ghaziabad");
    System.out.println(s1);
    System.out.println(s2);
} 
}