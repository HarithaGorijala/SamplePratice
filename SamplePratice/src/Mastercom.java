
public class Mastercom {

	public static void main(String[] args) {
		int a[]= {45,23,12,8,6,89,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length-1;k++) {
					if(a[i]+a[j]+a[k]==26) {
						System.out.println("the sum is equal" +a[i]+" "+a[j]+" "+a[k] );
					}else {
						//System.out.println("not equal"+" "+a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}

	}

}
