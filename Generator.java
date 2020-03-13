import java.util.ArrayList;

public class Generator {
	
	private ArrayList<Ecouteur> ecouteurs = new ArrayList<Ecouteur>();
	
	
	public Generator() {
		
	}
	
	public void addEcouteur(Ecouteur e) {
		this.ecouteurs.add(e);
	}
	
	
	public TimeEvent generateTimeEvent() {
		TimeEvent e = new TimeEvent(this);
		return e;
	}
	
	
	public PeriodicTimeEvent generatePeriodic(int p,int nb) {
		PeriodicTimeEvent pe = new PeriodicTimeEvent(this,p,nb);
		return pe;
	}
	
	public TimeOutEvent generateOut(int n) {
		TimeOutEvent te = new TimeOutEvent(this,n);
		return te;
	}
	
}
