package iterator.pattern.demo;

public interface IIterator {
	void First(); //Reset to first element
	String Next(); //get next element
	Boolean IsDone(); //end of collection check
	String CurrentItem(); //retrieve current item
}
