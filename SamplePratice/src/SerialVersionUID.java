import java.io.*;

public class SerialVersionUID implements Serializable{
	private static final Long serialVersionUid=1028l;
	int a=10;
	int b=20;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	/*	SerialVersionUID s=new SerialVersionUID();
		FileOutputStream fos=new FileOutputStream("svuid.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);		
        oos.writeObject(s);
        System.out.println("serialization completed:"+ s);   */
     
       FileInputStream fis=new FileInputStream("svuid.ser");
        ObjectInputStream os=new ObjectInputStream(fis);
		SerialVersionUID s1= (SerialVersionUID)os.readObject();
		System.out.println("deserialzation completed:"+s1);  

        
        
	}

}
