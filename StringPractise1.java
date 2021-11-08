package Day35String_Part1;

public class StringPractise1 {
	public static void main(String[] args) {
StringBuffer sb = new StringBuffer("i");
System.out.println("Name:"  + sb);
sb.append("Pavan");
System.out.println("Name:"  + sb);
sb.insert(1, "am");
System.out.println("Name:"  + sb);
sb.replace(1,3,"love"); 
System.out.println("Name:"  + sb);
sb.delete(1, 5);
System.out.println("Name:"  + sb);


StringBuffer s1=new StringBuffer("  ti rof nwonk si erolagnaB");
s1.reverse();
System.out.println(s1);
System.out.println("*********************************************");
StringBuffer s2=new StringBuffer();
System.out.println(s2.capacity());//default 16  
s2.append("JAVA IS VERY TOUGH");
System.out.println(s2.capacity());
s2.append("Nowadays Java is very easy");
System.out.println(s2.capacity());




}
}