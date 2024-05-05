package innerClassConcept;

public class RegularInnerClass {
	class Test{
		int z;
		public void sum(int x, int y) {
			System.out.println("Sum is " + (x+y));
		}
	}
	
	public static void main(String[] args) {
	
		RegularInnerClass regularinnerclass = new RegularInnerClass();
		regularinnerclass.new Test().sum(10, 20);
		
//		String str = null;
//		System.out.println(str.length());// throws NPE-> RTE
//		
//		int arr[] = {1,2,3};
//		System.out.println(arr[3]);  java.lang.ArrayIndexOutOfBoundsException: 
	}
}
