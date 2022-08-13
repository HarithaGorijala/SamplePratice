import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface{
           
	@Override
	public String toString() {
		return "SortedSet []";
	}

	public static void main(String[] args) {
	// 	List<Integer> l=new ArrayList<>();
		SortedSet<Integer> ss=new TreeSet<>();
         ss.add(12);
         ss.add(56);
         ss.add(9);
         ss.add(2);
         System.out.println(ss);
        
	}
}
