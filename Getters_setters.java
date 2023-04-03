package oops_Concept;
class Myemployee{
	private int id;
	private String name;
		
	 public String getName() {
		 System.out.println("Name :"+name);
		return name;
	 }
		public void setName(String n) {
			name = n;
		}
	public int getId() {
		System.out.println("Id :"+id);
		return id;
	}
	public void setId(int i) {
		id = i=5;
	}
	}

public class Getters_setters {
			 public static void main(String[] args) {
				
				 Myemployee o = new Myemployee();
				 System.out.println("this  is an example of getters and setters ");
				 o.setId(5);
				 o.getId();
				 o.setName("umesh");
				 o.getName();
				
			}
}
