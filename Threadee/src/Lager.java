
public class Lager extends Teil{
	
	private int anzahlThreadees;
	
	public Lager(){
	
	}
	public boolean ablegen(Teil artTeile, int anzahl){
		return false;
	}
	public Teil aufnehmen(Teil artTeil, int anzahl){
		return null;
	}
	public int getAnzahlThreadees(){
		return 0;
		
	}
	
}
