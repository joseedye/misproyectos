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
class Barca {
	private int id;
	private boolean isOcupado;
	private boolean isViajando;

	public Barca() {
		id = 0;
		isOcupado = false;
		isViajando = false;
	}

	public synchronized void esperarBarca(int idPeregrino) {
		while (isOcupado) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		id = idPeregrino;
		isOcupado=true;
		notifyAll();
	}

	public synchronized void esperarPeregrino() {
		while (!isOcupado) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		isViajando = true;
		notify();
	}

	public synchronized void esperarViaje(int idPeregrino) {
		while (isViajando) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void desembarcar() {
		isViajando = false;
		notifyAll();
	}

	public synchronized void regresarBarca() {
		id = 0;
		isOcupado=false;
		notify();
	}
}
