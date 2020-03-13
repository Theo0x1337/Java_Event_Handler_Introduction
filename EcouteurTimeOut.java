import java.util.concurrent.TimeUnit;

public class EcouteurTimeOut implements TimeOutEventInt,Ecouteur {

	@Override
	public void actionPerformed(TimeOutEvent e) {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(e.getDuree());
			System.out.println(e.getDateEvenement());
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(PeriodicTimeEvent generateOut) {
		// TODO Auto-generated method stub
		
	}

}
