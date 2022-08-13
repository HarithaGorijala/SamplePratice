class Method{
	private void m1() {
		System.out.println("this is m1");
	}
	static void m2() {
		System.out.println("this is m2 with static");
	}
}
public class MethodOverriding2 extends Method{
	private void m1() {
		System.out.println("m");
		//super.m1();
	}
	static void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		MethodOverriding2 mo=new MethodOverriding2();
		mo.m1();
		mo.m2();

	}

}
