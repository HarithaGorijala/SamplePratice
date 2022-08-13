import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    int id;
    String name;
    
    SetInterface(int id,String name){
    	this.id=id;
    	this.name=name;
    }
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
/*	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
   
	@Override
	public boolean equals(Object obj) {
		  
		return super.equals(obj);
	}     */

	public static void main(String[] args) {
		
		Set<Object> set=new HashSet<>();
		set.add('a');
		set.add('b');
		set.add('c');
		set.add('a');
		System.out.println(set);
		
		SetInterface s=new SetInterface(101,"abc");
		SetInterface s1=new SetInterface(101,"abc");
		SetInterface s2=new SetInterface(102,"abcd");
		Set<Object> set1=new HashSet<>();
		set1.add(s);
		set1.add(s1);
		set1.add(s2);
      System.out.println(set1);  

	}

	

}
