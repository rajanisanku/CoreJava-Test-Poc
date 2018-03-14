package test.learning;

public class Array_basic {
	private static final int NULL = 0;

	public static void main(String[] args) {
		int a[] = new int[5]; 
		Array_basic AB = new Array_basic();
		AB.addElements(a);
		AB.findOdd(a);
		AB.removeOddnumber(a);
		AB.display(a);
		
			
	}
	
	void addElements(int a[]) {
		for(int i=0; i<a.length;i++)
			a[i]=i+1;
	}
	
	void findOdd(int a[]) {
		System.out.println("Finding the odd values");
		for(int i = 0; i<a.length;i++) {
			if(a[i] %2 != 0)
			{
				System.out.println(a[i]);
			}
		}
	}
	
	void removeOddnumber(int a[]) {
		for(int i=0; i<a.length;i++)
			{
			if(a[i]%2 != 0) { a[i] = NULL;}
			}				
	}
	
	void display(int a[]) {
		System.out.println("ArrayList after deletion");
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
