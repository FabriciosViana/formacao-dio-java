package br.com.fabricioviana.desafio.smartv;

public class Usuario {

	public static void main(String[] args) {
		
		Smartv smarTv = new Smartv();	
		smarTv.ligarTv();
		smarTv.aumentarCanal();

		smarTv.aumentarCanal();
		smarTv.aumentarCanal();
		smarTv.aumentarCanal();

		smarTv.aumentarCanal();

		smarTv.diminuirCanal();

		smarTv.diminuirCanal();

		smarTv.diminuirCanal();

		smarTv.escolherCanal(13);

		smarTv.desligarTv();
		

	}

}
