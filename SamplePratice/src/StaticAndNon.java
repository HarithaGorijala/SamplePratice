
  class StaticAndNon {
 static  int a=10;
	int b=12;
	public void m1() {
		System.out.println(a);
		System.out.println(StaticAndNon.a=9);	
		}
	 static int m2(int a) {
		// System.out.println(b);
		return 5;
	}
   static int m2() {
	  return 2;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //        System.out.println(b);
		StaticAndNon  s=new StaticAndNon();
		s.m1();
		System.out.println(a=15);
		
		//System.out.println("b value" +s.b);
	}

}
