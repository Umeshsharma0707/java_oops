package oops_Concept;
class c{
	int a;
	c(int b){
		//super(b);
		System.out.println("this is parent constructor");
	}
//	c(int a){
//		this.a = a;
//		a=4;// this keyword
//	}
	
	
}
class c2 extends c{
	c2(int c){
		super(c);
		System.out.println("this is constructor c2");
	}
}
public class This_super_keywords {
		public static void main(String[] args) {
			//c obj = new c();
			c2 o = new c2(2);
			//System.out.println(obj.getA());
			
		}
}
