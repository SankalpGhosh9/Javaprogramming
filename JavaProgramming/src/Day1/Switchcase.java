package Day1;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
       switch (a) {
       case 1:System.out.println("Sunday");
       break;
       case 2:System.out.println("Monday is present");;
       break;
       default:System.out.println("day");;
       break;
       }
       String b = "Wednesday";
       switch (b) {
       case "Monday" : System.out.println(1);
       break;
       case "Tuesday" : System.out.println(2);
       break;
       case "Wednesday" : System.out.println(3);
       break;
       case "Thursday" : System.out.println(4);
       break;
       case "Friday" : System.out.println(5);
       break;
       case "Saturday" : System.out.println(6);
       break;
       case "Sunday" : System.out.println(7);
       break;
       default : System.out.println("Not applicable day");
       break;
       }
	}

}
