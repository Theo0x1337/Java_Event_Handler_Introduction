
public class PeriodicTimeEvent extends TimeEvent {
	
	private int periode;
	private int nb;
	
	public PeriodicTimeEvent(Object source,int p,int nb) {
		super(source);
		this.periode = p;
		this.nb = nb;
	}

	public PeriodicTimeEvent(Object source) {
		super(source);
	}
	
	public int getPeriode() {
		return this.periode;
	}

	
	public int getNb() {
		return this.nb;
	}
	
}
