
class StaticKeyword {
 int sq=4;
   double sq1=Math.sqrt(sq);
   
	static {
		System.out.println("This is static block");
	}
        void m1() {
        	System.out.println("hi");
        }
        public StaticKeyword() {
			this(10);
			// super();
		}
        StaticKeyword(int a){
        	
        }
	public	static void main(String[] args) {
		System.out.println("this is main method");
		StaticKeyword sk=new StaticKeyword();
		
		sk.m1();
		System.out.println(sk.sq1);

	}
}
