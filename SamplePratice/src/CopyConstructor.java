
public class CopyConstructor {
	int id;
   final String name;
	
	public CopyConstructor(int id,String name) {
	  this.id=id;
	  this.name=name;
	}
	public CopyConstructor(CopyConstructor c) {
		id=c.id;
	this.name=c.name;
	
		
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public  final void setName(String name) {
		name = name;
	}
	
	public String toString() {
		return "CopyConstructor [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
	CopyConstructor cc=new CopyConstructor(1,"gh");
	CopyConstructor cc1=new CopyConstructor(cc);
     System.out.println(cc);
     System.out.println( "The cc1 object is:" +cc1);
   cc1.setName("gk");
     System.out.println( "The cc1 object is:" +cc1.getName());
	}

}
