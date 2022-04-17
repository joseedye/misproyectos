/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yeison; 

import static java.lang.Thread.sleep;

/**
 *
 * @author acer
 */
class Peregrino extends Thread {
	private int id;
	private final Barca barca;

	public Peregrino(int id, Barca barca) {
		this.id = id;
		this.barca = barca;
	}

	public void run() {
		int tCamino = (int) (Math.random() * (4000 - 1000) + 1000);
		int tSantiago = (int) (Math.random() * (1000 - 500) + 500);
		try {
			sleep(tCamino);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("El peregrino " + id + " llega al lago");
		barca.esperarBarca(id);
		System.out.println("El peregrino " + id + " se se sube a la barca");
		barca.esperarViaje(id);
		System.out.println("El peregrino " + id + " se baja de la barca");
		try {
			sleep(tSantiago);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println("El peregrino " + id + " llega a Santiago");
	}

}
