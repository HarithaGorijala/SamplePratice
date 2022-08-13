//declare class as final
public  final class ImmutableClass {
	//create all feilds as private
	private final int a;
	
	 ImmutableClass(int a){
		 this.a=a;
	 }
	 public  final int getValue() {
		 return a;
	 }
	 //dont provide the setter methods
	 public void setValue(int a) {
		 
	 }

	public static void main(String[] args) {
		ImmutableClass ic=new ImmutableClass(10);
		
		ic.setValue(20);
	System.out.println(ic.getValue());  // 10
	System.out.println(ic.getValue());  // 10

	}

}
