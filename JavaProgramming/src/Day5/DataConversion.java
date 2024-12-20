package Day5;

public class DataConversion {

	public static void main(String[] args) {
//		String s ="welcome";
//		int sint = Integer.parseInt(s);
//		System.out.println(sint);
		
		String s1 ="12455664";
		int sint1 = Integer.parseInt(s1);
		System.out.println(sint1);
		System.out.println(((Object)sint1).getClass().getSimpleName());

		int s =366723;
		System.out.println(String.valueOf(s));
		System.out.println(((Object)String.valueOf(s)).getClass().getSimpleName());
	}

}
