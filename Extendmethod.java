class Animal{
    protected String name;
    protected void display(){
        System.out.println("I am an animal.");
}
}
class Extendmethod extends Animal{
    public static void main(String[] main){
        Extendmethod dog=new Extendmethod();
        dog.display();
        dog.name="Java";
        System.out.println(dog.name);
    }
}