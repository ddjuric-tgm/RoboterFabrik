
public class Lagermitarbeiter implements Stoppable{
	
	public boolean anlieferung(Teil artTeile, int anzahl){
		return false;
	}
	public boolean auslieferung(int stueckzahl){
		return false;
	}
	public boolean teileVorhanden(){
		return false;
	}
	public Teil[] abholung(){
		return null;
	}
	public boolean threadeesVorhanden(int[] stueckzahl){
		return false;	
	}
	public String threadyAblegen(){
		return null;
	}
	
	
	
	@Override
	public void stoppen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
