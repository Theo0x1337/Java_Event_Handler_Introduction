import java.awt.event.MouseEvent;
import java.util.GregorianCalendar;

public class EcouteurTimeEvent implements TimeEventListener,Ecouteur{

	@Override
	public void actionPerformed(TimeEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getDateEvenement());
	}

	@Override
	public void actionPerformed(TimeOutEvent generateOut) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(PeriodicTimeEvent generateOut) {
		// TODO Auto-generated method stub
		
	}

	

}
