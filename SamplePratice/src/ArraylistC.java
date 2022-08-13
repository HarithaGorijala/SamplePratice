import java.util.ArrayList;
import java.util.List;

public class ArraylistC {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(8);
		list.add(0);
		System.out.println(list);

     List<Integer> c=new ArrayList<>(list);
     c.add(98);
     System.out.println(c);
		
	}

}
