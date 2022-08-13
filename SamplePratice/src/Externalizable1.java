import java.io.*;
import java.util.*;
class Student implements Externalizable{
	String name;
	int id;
	int sal;
	public Student(){
		System.out.println("no argu cons");
	}
	public Student(int id,String name,int sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(sal);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=(String)in.readObject();
		sal=in.readInt();
				
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	
}
public class Externalizable1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s=new Student(123,"gk",980765);
		FileOutputStream fos=new FileOutputStream("mno.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		System.out.println("complted Serilazation with externalization");
		
		 FileInputStream fs=new FileInputStream("mno.ser");
		   ObjectInputStream os=new ObjectInputStream(fs);
		  Student s2=(Student) os.readObject();
		  System.out.println("deserialzation completed:"+s2);

	}

}
