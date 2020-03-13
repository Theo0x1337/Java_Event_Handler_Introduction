import java.util.concurrent.TimeUnit;

public class EcouteurPeriodicEvent implements PeriodicTimeEventInter,Ecouteur {
	

	@Override
	public void actionPerformed(PeriodicTimeEvent e) {
		// TODO Auto-generated method stub
				try {
					for(int i = 0;i<e.getNb();i++) {
						System.out.println(e.getDateEvenement());
						System.out.println("Je suis le "+(i+1)+" eme evenement émit");
						System.out.println("");
						TimeUnit.SECONDS.sleep(e.getPeriode());
					}
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	}

	@Override
	public void actionPerformed(TimeOutEvent generateOut) {
		// TODO Auto-generated method stub
		
	}
}
