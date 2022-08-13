
public class MultiThreadingSync extends Thread{
	
	       synchronized void m1() {
		  for(int i=0;i<=10;i++) {
			  System.out.println("this is method m1");
		  }
	       }
	  
	 public void m2() {
		 System.out.println("this is m2");
	 }
	   
	public static void main(String[] args) {
	 final	MultiThreadingSync m=new MultiThreadingSync();
	 Thread t1=new Thread() {
	 	public void run() {
	   		m.m1();
	   	}
	 };
	 m.m2();
		
		  for(int i=20;i<=30;i++) {
			  System.out.println("this is main method ");
		  }
          m.start();
          t1.start();
	}
}
