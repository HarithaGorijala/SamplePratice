import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionDuplicate {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,1,2);
	 Set<Integer> k=	list.stream().filter(i -> Collections.frequency(list,i)>1).collect(Collectors.toSet());
	   System.out.println(k);
	
		/*
		
//		 int [] arr = new int [] {1, 2, 3, 4, 1,2};   
//         
//	        System.out.println("Duplicate elements in given array: ");  
//	        //Searches for duplicate element  
//	        for(int i = 0; i < arr.length; i++) {  
//	            for(int j = i + 1; j < arr.length; j++) {  
//	                if(arr[i] == arr[j])  
//	                    System.out.println(arr[j]);  
//	       }  
	       // }  
	
	     ArrayList<Integer> list=new ArrayList<>();
	     list.add(1);
	     list.add(2);
	     list.add(3);
	     list.add(1);
	     
	     Set<Integer> s = new HashSet<>();

	        for(Integer n : list) {
	            if(s.add(n) == false)
	                System.out.println(n +"  "+   "is duplicated");
	     
                               	        
	    }  */
	}

}

