
public class Shortcuts {
       void m1() {
    	   m2(13);
    	   System.out.println("hello");
    	   
       }
       void m2(int i) {
    	   System.out.println("hi:"+ i);
       }
	public static void main(String[] args) {
		Shortcuts s=new Shortcuts();
		s.m1();

	}

}
