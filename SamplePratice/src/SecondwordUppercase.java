import java.util.StringTokenizer;

public class SecondwordUppercase {
	
	public static void main(String[] args) {
		String s="hi hello";
		try {
		StringTokenizer a=new StringTokenizer(s," ");  
		
		String s1="";
		while(a.hasMoreTokens()) {
			s1= s1.toLowerCase() +"  "+ a.nextToken().toUpperCase();
		}
		System.out.println(s1);
		
		
		
		
		
		
		
		
		//s.split(" ");
		// System.out.println(a.length);
	/*  (int i=0;i<a.length;i++) {
		    if(a[i].equals(a[i])) {
		      String  s1=	a[0]+" "+a[i].toUpperCase();
		      
		       System.out.println(s1);
		    }
			
		    
		}   */
		}catch(Exception e) {
			System.out.println("hello ji");
		}
    
	}

}
