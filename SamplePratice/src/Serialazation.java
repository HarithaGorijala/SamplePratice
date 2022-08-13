import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
 	String name;
	int id;
	public Employee(int id,String name){
		this.id=id;
		this.name=name;
		}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
public class Serialazation {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
   Employee e1=new Employee(101,"haritha");
   FileOutputStream fos=new FileOutputStream("abc.ser");
   ObjectOutputStream oos=new ObjectOutputStream(fos);
   oos.writeObject(e1);
   System.out.println("serialazation complted");
      
   FileInputStream fs=new FileInputStream("abc.ser");
   ObjectInputStream os=new ObjectInputStream(fs);
  Employee e2=(Employee) os.readObject();
  System.out.println("deserialzation completed:"+e2);
  
	}

}
