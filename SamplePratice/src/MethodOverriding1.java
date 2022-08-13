interface Food{
	public void Type(); 
}
class Veg implements Food{
	public void Type() {
		System.out.println("veg");
	}
}
class Nonveg implements Food{
	public void Type() {
		System.out.println("nonveg");
	}
}
public class MethodOverriding1  {

	public  static void main(String[] args) {
		Veg v=new Veg();
		v.Type();
		

	}

}
