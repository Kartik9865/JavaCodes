package innerClassConcept;

public class AnonymousInnerClass {
	 public void eat() {
		 System.out.println("khale BKL");
	 }
	 public void eatagain() {
		 System.out.println("khayega???");
	 } 
	 public static void main(String[] args) {
		 AnonymousInnerClass cls1 = new AnonymousInnerClass();
		  cls1.eat();
		  cls1.eatagain();
		  
		 AnonymousInnerClass cls =  new AnonymousInnerClass() {
			 public void eat() {
				 System.out.println("Maa chudaa fir");
			 }
		 };
		 
		 cls.eat();
	 }
}
