

public class Watchdog implements Runnable{
	private int pause;
	private Stoppable t;
	
	public Watchdog(int pause,Stoppable t){
		this.pause=pause;
		this.t=t;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(pause);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.stoppen();
		
	}
}
