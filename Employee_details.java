package oops_Concept;

class Employee{
	Employee(){
		System.out.println("this is constructor");
	}
	int salary;
	public int getSalary() {
		System.out.println("Salary:"+salary);
		return salary;
	}
	String name;
	public String getName() {
		System.out.println("Name  :"+name);
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	
}
class Cellphone extends Employee{
	public void ringing() {
			System.out.println("ringing...");
	}
	public void vibrating() {
			System.out.println("vibrating...");
	}
	public void calling() {
			System.out.println("calling "+ name);
	}
}  
public class Employee_details {
			 public static void main(String[] args) {
				Cellphone c = new Cellphone();
				c.salary=5000;
				c.setName("umesh");
				c.getSalary();
				
				c.getName();
				c.ringing();
				c.vibrating();
				c.calling();
				
			}
}
