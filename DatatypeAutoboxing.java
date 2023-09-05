//Declare the primitive datatype with some initial value. Convert these primitive data types to object using wrapper class.
public class DatatypeAutoboxing{
    public static void main(String[] args){
        //For integer
        int a=20;
        Integer j=a;
        System.out.println("Our integer datatype value= "+j);
        
        //For boolean
        boolean b=true;
        Boolean B=b;
        System.out.println("Our boolean datatype value= "+B);
        
        //For character
        char c='t';
        Character C=c;
        System.out.println("Our character datatype value= "+c);
        
        //For long
        long l=4634626466L;
        Long L=l;
        System.out.println("Our long datatype value= "+L);
        
        //For float
        float f=3.453f;
        Float F=f;
        System.out.println("Our float datatype value= "+F);
        
        //For double
        double d=3.12314342312412412124D;
        Double D=d;
        System.out.println("Our double datatype value= "+D);
        
        //For short 
        short s=1000;
        Short S=s;
        System.out.println("Our integer datatype value= "+S);
        
        //For byte
        byte by=10;
        Byte BY=by;
        System.out.println("Our byte datatype value= "+BY);
    } 
}