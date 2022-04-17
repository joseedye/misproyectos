/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relojraro;

/**
 *
 * @author joseeduardo
 */


import java.io.*;

/**
 *
 * @author acer
 */
public class Camino {
	public static void main(String[] args) {
		int nPeregrinos = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Indique el número de peregrinos que empiezan el camino: ");
		try {
			nPeregrinos = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e1) {
			System.err.println("Debe introducir un número válido");
		}

		Barca barca = new Barca();
		Barquero barquero = new Barquero(barca, nPeregrinos);
		Peregrino[] peregrinoV = new Peregrino[nPeregrinos];
		
		barquero.start();
		for (int i = 0; i < peregrinoV.length; i++) {
			Thread peregrino = new Peregrino((i + 1), barca);
			peregrino.start();
			peregrinoV[i] = (Peregrino) peregrino;
		}
		try {
			barquero.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < peregrinoV.length; i++) {
			try {
				peregrinoV[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n¡¡ Todos los peregrinos han llegado a Santiago !!");

	}
}
