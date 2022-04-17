/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeison;

/**
 *
 * @author acer
 */
class Barquero extends Thread {
	private final Barca barca;
	private int nPeregrinos;

	public Barquero(Barca barca, int nPeregrinos) {
		this.barca = barca;
		this.nPeregrinos = nPeregrinos;
	}

	public void run() {
		while (nPeregrinos > 0) {
			barca.esperarPeregrino();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			barca.desembarcar();
			nPeregrinos--;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			barca.regresarBarca();
		}
	}
}
