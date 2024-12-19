package Day3;

public class StringOperationsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SANKALP ";
		String s1 = "GHOSH";
		int length=s.length();
		System.out.println(length);
		System.out.println(s.concat(s1));
		
		s = "   welcome";
		System.out.println(s);
		System.out.println(s.length()); // length of the string
		System.out.println(s.trim().length());// trim away the extra spaces
		
		System.out.println(s.charAt(3));// returns the string element at the particular index
		System.out.println(s.endsWith("me")); // returns a boolean for checking either the char or string is present
		System.out.println(s.contains("lc")); // contains some part
		System.out.println(s.equals("   welcome")); //strict comparison
		System.out.println(s.equalsIgnoreCase("   Welcome")); //compare while ignoring casesensitive
		
		s="Hello world let go play valorant ";
		System.out.println(s.replace("or", "qou"));// Replace charcters and phrase
		System.out.println(s.replace('o', 's'));
		
		System.out.println(s.substring(4,10));// ending index should do (-1)
		
		String a[] = s.split("g");// whichever element is there it will divide it into two parts from there
		System.out.println(a[0]); 
		System.out.println(a[1]); 
	}

}
