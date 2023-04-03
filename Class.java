package oops_Concept;

 class Employee1{
	int id = 1;
	String name ="umesh";
		public void get() {
			System.out.println("id  :"+id);
			System.out.println("name:"+name);
		}
		public int get(int a, int b) {
			System.out.println("value of a : "+a);
			System.out.println("value of b : "+b);
			int sum = a+b;
			System.out.println(sum);
			return sum;
		}
		
}

public class Class {
			 public static void main(String[] args) {
			System.out.println("this is our custom class");	
			Employee1 obj = new Employee1();
			
			
			obj.get();
			obj.get(1,5);
			
			}
			 
}
