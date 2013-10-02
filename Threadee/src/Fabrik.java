
public class Fabrik implements Runnable {
	
	private Sekreteriat sek;
	private Lager lager;
	private Lagermitarbeiter lagmit;
	private Montagearbeiter montmit;
	private Kunde kunde;
	
	public Fabrik(){
		sek=new Sekreteriat();
		lager= new Lager();
		lagmit= new Lagermitarbeiter();
		montmit= new Montagearbeiter();
		kunde= new Kunde();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
