import java.io.*;
class Practicaleight
{
    public static void main(String []args) throws IOException
    {
        StringBuffer str
			= new StringBuffer("Harshit");
        System.out.print("Main String: "+str);
         
         //setcharat()
        str.setCharAt(2,'R');
        System.out.println("\n\nAfter setCharAt() String = "+ str.toString());
        
        //setlength()
		str.setLength(5);
		System.out.println("\n\nAfter setLength() String = "+ str.toString());
		
		//append
		str.append(" Sahu");
		System.out.println("\n\nAfter append() String = "+ str.toString());
		
		//insert
		str.insert(5," kumar");
		System.out.println("\n\nAfter insert() String = "+ str.toString());
		
		//concat
		String s= "HaRsh kumar Sahu";
		s= s.concat(" Handsome");
		System.out.println("\n\nAfter concat() String = "+ s);
		
		//equals
		String s1 = "HELLO";
		String s2 = new String("HELLO");
		System.out.print("\n\nString1 = "+s1);
		System.out.print("\nString2 = "+s2);
		System.out.println("\nAfter equals String = "+ s1.equals(s2));
    }
}