import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class OccuranceArray {
   
	public static void main(String[] args) {
		// rev string 
		String st="haritha";
		   int len=st.length();
		   String rev="";
		  
		for(int i=len-1;i>=0;i--) {
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		// find the occurances
        List<Integer> ls= Arrays.asList(23,3,5,7,3,26,3,5);
     Map<Integer,Long> m= 
    		  ls.stream()
    		  .collect(Collectors.groupingBy(e -> e,Collectors.counting()));
    		 // .forEach(System.out::println);
     
     System.out.println(m);
     
     ls.stream().map(e->e.toString()).filter(n -> n.startsWith("2")).forEach(System.out::println);
     
     List<String> l=Arrays.asList("The","Java","Interview");
    String k= l.stream().collect(Collectors.joining("-"));
    System.out.println(k);
	
	
	List<String> list= Arrays.asList("hi","hi","hello","bye");
	Map<Object, Long> s= list.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
   System.out.println(s);
 
   List<Integer> ls1=new ArrayList<>();
   ls1.add(2000);
   ls1.add(3000);
   ls1.add(5000);
  List<Integer> l1= ls1.stream().map(s1->s1+5000).collect(Collectors.toList());
  System.out.println(l1);
  
  
  //otp generation
  int random=new Random().nextInt(9999);
  String otp=String.format("%06d", random);
  System.out.println(otp);
  
}
	
}

