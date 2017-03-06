package iterator.pattern.demo;

import java.util.LinkedList;

public class Science implements ISubject {

	private LinkedList<String> subjects;
	
	public Science() {
		subjects = new LinkedList<String>();
		subjects.addLast("Maths");
		subjects.addLast("Comp. Sc.");
		subjects.addLast("Physics");
		
	}
	
	@Override
	public IIterator CreateIterator() {
		return new ScienceIterator(subjects);
	}
	
	public class ScienceIterator implements IIterator{

		private LinkedList<String> subjects;
		private int position;
		
		public ScienceIterator(LinkedList<String> subjects) {
			this.subjects = subjects;
			this.position = 0;
		}
		
		@Override
		public void First() {
			this.position = 0;
		}

		@Override
		public String Next() {
			return subjects.get(position++);
		}

		@Override
		public Boolean IsDone() {
			return position>= subjects.size();
		}

		@Override
		public String CurrentItem() {
			return subjects.get(position);
		}
			
	}

}
