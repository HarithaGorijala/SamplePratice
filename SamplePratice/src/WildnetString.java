
public class WildnetString {

	public static void main(String[] args) {
		
		  String s="india";
		 /* StringBuffer sb=new StringBuffer();
		  char ch[]=s.toCharArray();
		  for(int i=0;i<ch.length;i++)
		  { if(i%2==0) {
		  sb.append((char)(ch[i]+1)); }
		  else { 
			  sb.append((char)(ch[i]-1)); }
		  
		  } System.out.println(sb.toString());
		  
		 */
		  char ch[]=s.toCharArray();
		  for(char c:ch) {
			  System.out.println(c);
		  }
		 }
}
