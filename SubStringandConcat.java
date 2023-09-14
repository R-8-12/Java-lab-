//Demonstrate the substring and concat function.
class SubStringandConcat{
    	public static void main(String[] args) {
    	    
    	    String first="Java";
    	    System.out.println("First String:"+first);
    	    
    	    String second="Programming";
    	    System.out.println("Second String:"+second);
    	  
    	    String joinedString=first.concat(second);
    	    System.out.println("Joined String:"+joinedString);
    	    
    	    String s3=second.substring(2,4);
    	    System.out.println(s3);
    	}
}   