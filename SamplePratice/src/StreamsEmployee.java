import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsEmployee {
     static  int sal;
       String name;
       public StreamsEmployee(int sal,String name) {
    	   this.sal=sal;
    	 this.name=name;   
	}
       
	public static int getSal() {
		return sal;
	}

	public  void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StreamsEmployee [sal=" + sal + ", name=" + name + "]";
	}

	public static void main(String[] args) {
   
		StreamsEmployee se=new StreamsEmployee(200, "haritha");
		StreamsEmployee se1=new StreamsEmployee(45230, "gk");
		StreamsEmployee se2=new StreamsEmployee(12250, "gl");
		List<StreamsEmployee> list=new ArrayList<>();
		list.add(se);
		list.add(se1);
		list.add(se2);
         //List<Object> s1= (List<Object>) list.stream().map(s->s.getSal()+5000);
        
		//List<StreamsEmployee> ls =list.stream().map(StreamsEmployee::getSal())+5000;
       //  System.out.println(s1);
		List<StreamsEmployee> li= (List<StreamsEmployee>) list.stream().filter(e->e.getSal()>10000);
		System.out.println(li);
	}

}
