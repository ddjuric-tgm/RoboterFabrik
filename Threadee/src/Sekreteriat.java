import java.util.HashSet;
import java.util.Random;


public class Sekreteriat implements Runnable {
	
	private HashSet threadyId;
	private HashSet mitarbeiterId;
	private HashSet lieferantId;
	private HashSet montageArbeiterId;
	private HashSet lagerMitarbeiterId;
	private Random rand = new Random();
	
	
	public Sekreteriat(){
		threadyId = new HashSet<>();
		threadyId.add(rand.nextInt(200));
		mitarbeiterId = new HashSet<>();
		mitarbeiterId.add(rand.nextInt(200));
		lieferantId= new HashSet<>();
		lieferantId.add(rand.nextInt(200));
		montageArbeiterId = new HashSet<>();
		montageArbeiterId.add(rand.nextInt(200));
		lagerMitarbeiterId= new HashSet<>();
		lagerMitarbeiterId.add(rand.nextInt(200));
	}
	public HashSet getThreadyId() {
		return threadyId;
	}
	public HashSet getMitarbeiterId() {
		return mitarbeiterId;
	}
	public HashSet getLieferantId() {
		return lieferantId;
	}
	public HashSet getMontageArbeiterId() {
		return montageArbeiterId;
	}
	public HashSet getLagerMitarbeiterId() {
		return lagerMitarbeiterId;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
