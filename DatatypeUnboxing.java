//Declare the primitive datatype with some initial value. Convert these primitive data types to object using wrapper class.
public class DatatypeUnboxing{
    public static void main(String[] args){
        //For integer
        Integer j=new Integer(3);
        int i=j;
        System.out.println("Our integer datatype value= "+i);
        
        //For boolean
        Boolean B=new Boolean(true);
        Boolean b=B;
        System.out.println("Our boolean datatype value= "+b);
        
        //For character
        Character C=new Character('t');
        char c=C;
        System.out.println("Our character datatype value= "+c);
        
        //For long
        Long l=new Long(4634626466L);
        long L=l;
        System.out.println("Our long datatype value= "+L);
        
        //For float
        Float f=new Float(3.453f);
        float F=f;
        System.out.println("Our float datatype value= "+F);
        
        //For double
        Double d=new Double(3.12314342312412412124D);
        double D=d;
        System.out.println("Our double datatype value= "+D);
        
       /* //For short 
        Short sh=new Short(-34);
        short S=sh;
        System.out.println("Our integer datatype value= "+S);
        
        //For byte
        Byte by= new Byte(10);
        Byte BY=by;
        System.out.println("Our byte datatype value= "+BY);*/
        
        
    } 
}