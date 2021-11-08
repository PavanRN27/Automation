package Day35String_Part1;

public class stringpractise {
	public static void main(String[] args) {
		
		String P= "Pavankumar"; 
		String P1= "Pavankumar";
		String P2= "Rajendra";
		String P3= "Nirmal";
		System.out.println("P;" + P);
		System.out.println("P1;" + P1);
		System.out.println("P2;" + P2);
		System.out.println("P3;" + P3);
		
		System.out.println("P char count: "+P.length());
		System.out.println("P2 char count: "+P2.length());
		System.out.println("P3 char count: "+P3.length());

		System.out.println("P1 & P2 using equals(): "+P1.equals(P2));
		System.out.println("P1 & P using equals(): "+P1.equals(P));
		System.out.println("p1 & p3 using equals(): "+P1.equals(P3));
		

	}

}
