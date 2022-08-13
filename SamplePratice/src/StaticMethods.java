class Haritha{
	
	public static void m1() {
		int a=10;
		
		System.out.println("haritha" + a);
	}
}
class Komali extends Haritha{
	public static void m1() {
       int a=20;
		System.out.println("komali" + a);
	}
}
public class StaticMethods {

	public static void main(String[] args) {
		Komali k=new Komali();
		Haritha h=new Haritha();
		h.m1();
		k.m1();

	}

}
