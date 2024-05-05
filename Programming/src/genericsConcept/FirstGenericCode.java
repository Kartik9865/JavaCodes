package genericsConcept;

 class ExecutingFirstGenericCode <T>{
	 
	 private  T  t;
	 
	 public void getValue(T t) {
		 this.t =t;
	}
	 
	public T getReturnValue() {
		return t;
	}
}

 	public class FirstGenericCode {	
 		public static void main(String[] args) {
	 		ExecutingFirstGenericCode<String> fc= new ExecutingFirstGenericCode<>();
			ExecutingFirstGenericCode<Integer> fc1= new ExecutingFirstGenericCode<>();
 				fc.getValue(new String("Kartikey"));
 				fc1.getValue(new Integer(10));;
 				System.out.println(fc.getReturnValue());
}
}
