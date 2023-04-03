package oops_Concept;
import java.util.Scanner;
class data{
	public data() {
		System.out.println("enter your details");
		
	}
	String name;
	int roll;
	public void setdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("roll no :"); 
		 roll = sc.nextInt();
		System.out.println("name :");
		 name = sc.next();
		// name.replace(" ","_");
	}
	public void getdata() {
		System.out.println("Roll No. :"+roll);
		System.out.println("Name :"+name);

	}
}
public class prac {
public static void main(String[] args) {
			data d = new data();
			d.setdata();
			d.getdata();
			
}
}
