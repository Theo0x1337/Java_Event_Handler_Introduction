import java.util.Date;
import java.util.EventObject;
import java.util.GregorianCalendar;

public class TimeEvent extends EventObject {

		
	public TimeEvent(Object source) {
		super(source);
	}
	
	
	public Date getDateEvenement() {
		GregorianCalendar cal = new GregorianCalendar();
		return cal.getTime();
	}
	
}
