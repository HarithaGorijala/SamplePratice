
public class ExceptionThrows {
   static void m1() throws HarithaNotFound {
	   int a=1;
    	try {
    		if(a==10) {
    			System.out.println(a);
    		}else {
    			 HarithaNotFound hn=new HarithaNotFound("heyy");
    		}
			/*
			 * int a=10; int b=0; int c=a/b; System.out.println(c);
			 */
    	}catch(HarithaNotFound h) {
    		System.out.println("not found");
    	}
    	finally {
    		System.out.println("hii");
    	}
    }
	public static void main(String[] args) {
		
         ExceptionThrows.m1();
	}

}
