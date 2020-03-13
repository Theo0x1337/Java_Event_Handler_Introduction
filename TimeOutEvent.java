
public class TimeOutEvent extends TimeEvent {

	private int duree;
	
	public TimeOutEvent(Object source, int dur) {
		super(source);
		this.duree = dur;
	}

	public int getDuree() {
		return this.duree;
	}
	
}
