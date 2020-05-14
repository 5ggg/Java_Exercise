package Office;

import People.Date;
import People.Lop;
import People.Person;

public class Boss extends Person {
	Lop workers = new Lop(10);
	int workerIndex = 0;
	
	public Boss (String n, Date d) {
		super (n, d);
	}
	
	// using protected method type
	protected void add_worker(Worker w) {
		workers.add(w);
		w.new_boss(this);
	}
	
	// using protected method type
	protected void sub_worker(Worker w) {
		workers.remove(w);
	}
	
	public Worker next() {
		Worker w = (Worker) workers.getPerson(workerIndex);
		workerIndex++;
		return w;
	}
	
	public void reset() {
		workerIndex = 0;
	}
	

}
