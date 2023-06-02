
package br.com.fabricioviana.desafio.smartv;
import java.util.Scanner;

public class Smartv {

	boolean ligada = false;
	int canal = 1;
	int volume = 25;
	
	public void ligarTv() {
		ligada = true;
		System.out.println("A tv está ligada");
	}
	
	public void desligarTv() {
		ligada = false;
		System.out.println("A tv está desligada");
	}
	
	public void aumentarVolume() {
		volume ++;
		System.out.println("Volume: " +  volume);
	}
	public void diminuirVolume() {
		volume --;
		System.out.println("Volume: " +  volume);
	}
	
	public void aumentarCanal() {
		canal ++;
		System.out.println("O canal atual é " + canal);
	}
	
	public void diminuirCanal() {
		canal --;
		System.out.println("O canal atual é " + canal);
	}

	public void escolherCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("O canal atual é " + canal);
		
	}
}
