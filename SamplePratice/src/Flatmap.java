import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,5,7,9);
		List<String> lst=Arrays.asList("hi","hello");
		List<Character> ls=Arrays.asList('a','h');
		List<Object> flat=Stream.of(list,lst,ls).flatMap(l->l.stream()).collect(Collectors.toList());
		System.out.println(flat);
		 
	}

}
