package controller;

public class MatrizThread extends Thread{

	private int[][] matriz;
	private int linha;
	
	public MatrizThread (int[][] matriz, int linha) {
		this.matriz = matriz;
		this.linha = linha;
	}

	@Override
	public void run() {
		calculaLinha(matriz, linha);
	}

	private void calculaLinha(int[][] matriz, int linha) {
		int soma = 0;
		for (int i = linha; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				soma = matriz[linha][j] + soma;
			}
		}
		System.out.println("#" + getId() + " ==> Linha: " + linha + "  Soma = " + soma);
	}
}
