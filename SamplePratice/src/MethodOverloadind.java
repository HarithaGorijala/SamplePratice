class MethodOverriding{
	static class ha{
	}
	
	
	public int sub() {
		//System.out.println("this is parent");
		return 2;
	}
	
}

public class MethodOverloadind extends MethodOverriding {
	@Override
    public int sub() {
    	System.out.println("this is child");
    	return 6;
    }
     public int add(int a,int b) {
    	// int c=a+b;
    //	 System.out.println(c);
    	 
    	 return a+b;
     }
     public float add(float a,float b) {
    	 return a+b;
    	 
     }

	public static void main(String[] args) {
		ha h=new ha();
     MethodOverloadind mo=new MethodOverloadind();
     mo.add(2, 5);
     mo.add(4, 05);
     mo.sub();
	}

}
