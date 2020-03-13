import javax.swing.JFrame;

public class Main {
	
	
	public static void main(String[]args) {
		
		
		Generator gen = new Generator();
		EcouteurTimeEvent ecoute = new EcouteurTimeEvent();
		gen.addEcouteur(ecoute);
		
		Ecouteur ecouteOut = new EcouteurTimeOut();
		
		
		Ecouteur ecoutePeriodic = new EcouteurPeriodicEvent();
		
		gen.addEcouteur(ecouteOut);
		gen.addEcouteur(ecoutePeriodic);
		
		
		ecoute.actionPerformed(gen.generateTimeEvent());
		
		System.out.println("");
		System.out.println("");
		
		ecoutePeriodic.actionPerformed(gen.generatePeriodic(2,4));

		
		
		ecouteOut.actionPerformed(gen.generateOut(3));
		
		
		JFrame fenetre = new JFrame();
	    fenetre.setVisible(true);
	    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fenetre.setSize(400, 100);

		
		
	}
}
