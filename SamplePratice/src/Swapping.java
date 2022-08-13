import java.util.HashMap;

public class Swapping {

	public static void main(String[] args) {
	/*	int x=2;
		int y=3;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x +" "+y);   */
		
	/*	String s="hi hello hi world";
		String[] split=s.split(" ");
		HashMap<String,Integer> hs=new HashMap<>();
		for(int i=0;i<split.length;i++) {
			if(hs.containsKey(split[i])) {
				int count=hs.get(split[i]);
				hs.put(split[i], count+1);
				
			}
			else {
				hs.put(split[i], 1);
			}
		}
		System.out.println(hs);  */
		String s="234.65";
		Double d=Double.valueOf(s);
		
		System.out.println(d);
		}

}
