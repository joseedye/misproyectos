import java.util.concurrent.Semaphore;
public class p4 extends Thread  {

	protected Semaphore oFinP1;
	protected Semaphore oFinP3;
	public p4(Semaphore oFinP1,Semaphore oFinP3) {
		this.oFinP3 = oFinP3;
		this.oFinP1 = oFinP1;
	}
	
	
	public void run()  {
		try {
			this.oFinP1.acquire();
			this.oFinP3.acquire();
			} catch(Exception e) {
				e.printStackTrace();
			}
		try {
			sleep((int) Math.round(500 * Math.random() - 0.5));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("P4");
	}
}
