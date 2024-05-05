package innerClassConcept;

public class MethodLocalInnerClass {
	
	public void show() {
		
		System.out.println("Inside show method of outer class");
		
		class MethodLocalImplementation{
			
			public void implementMethodLocal() {
				System.out.println("Method Local Inner class implememnted");
			}
		}
		
		MethodLocalImplementation mli = new MethodLocalImplementation();
		mli.implementMethodLocal();
	}
	
	 public static void main(String[] args) {
		 
		 MethodLocalInnerClass mlic = new MethodLocalInnerClass();
		 mlic.show();
	}
}