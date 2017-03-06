package iterator.pattern.demo;

public class IteratorPatternEx {

	public static void main(String[] args) {
		System.out.println("****Iterator Pattern Demo******");
		ISubject sc_subject = new Science();
		ISubject ar_subject = new Arts();
		
		IIterator sc_iterator = sc_subject.CreateIterator();
		IIterator ar_iterator = ar_subject.CreateIterator();
		
		System.out.println("Science Subjects:");
		Print(sc_iterator);
		
		System.out.println("Arts Subjects:");
		Print(ar_iterator);
	}
	
	public static void Print(IIterator iterator){
		while (! iterator.IsDone()) {
			System.out.println(iterator.Next());
			
		}
	}

}
