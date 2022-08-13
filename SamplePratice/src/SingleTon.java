
public class SingleTon{
	private static SingleTon s; //=new SingleTon("haritha");
	public String name;
	private SingleTon(String name) {
		this.name=name;
	}
	public static SingleTon getInstance() {
	
	return s;	
	}

	@Override
	public String toString() {
		return "SingleTon [name=" + name + "]";
	}

	
	public static void main(String[] args) {
		
         s=new SingleTon("haritha");
       System.out.println( s.getInstance());
		s.getInstance(); 
		 SingleTon s1=new SingleTon("komali");
		System.out.println(s1.getInstance());
         SingleTon s2=new SingleTon("lakshmi");
        System.out.println(s2.getInstance());
	}

}
