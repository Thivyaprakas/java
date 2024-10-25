package codes;

public class Variable3 {

	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5,6,7}; // integer type array
		 
		 String s[] = {"welcome","to","focus","on","java"}; // string type array
		 
		 System.out.println(s[0]);
		 
		 Object c[]= {"name",3>10,1,2,'t'};
		 
		 System.out.println(c[1]);
		 java(); // calling  a userdefined method inside the main method
		 
		 
	}
	
	public static void java() {
		int z=30;
		System.out.println(z);
	}

}
