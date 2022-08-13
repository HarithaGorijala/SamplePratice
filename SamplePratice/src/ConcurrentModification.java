import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModification {
	



	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(8);
		System.out.println(list);
		
	/*	for(Integer i:list) {
			if(i.equals(5)) {
				list.remove(i);
			}
			System.out.println(i);
		}   */
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			Integer i=itr.next();
			if(i.equals(6)) {
				itr.remove();
			System.out.println(list);
			}
		}

	}

}
