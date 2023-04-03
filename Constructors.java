package oops_Concept;
class demo{
	int id;
	String name;
	public demo(String myname,int i){
		System.out.println("this is constructor");
		 id = i;
		 name = myname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
public class Constructors {
			 public static void main(String[] args) {
				demo d = new demo("umesh",5);
//				d.setId(5);
//				d.setName("umesh");
				System.out.println(d.getId());
				System.out.println(d.getName());
			}
}
