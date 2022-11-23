package velhaModel;

import velhaInterface.VelhaInterface;

public class Tabuleiro implements VelhaInterface{
	
	private String[][] tabuleiro = new String[3][3];
	
	public Tabuleiro() {
	}
	
	public Tabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
	public String[][] getTabuleiro() {
		return tabuleiro;
	}
	
	public void setTabuleiro(String[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	@Override
	public Boolean horizontaVelha() {

		for(int i=0; i<tabuleiro.length; i++) {
			int n = 0;
			for(int j=0; j<tabuleiro.length; j++) {
				if(tabuleiro[i][j].charAt(0) == 'x') {
					
					n++;
					if(n == 3) {
						
						return true;
					}
					
				}
			}
		}
		
		return false;
	}

	@Override
	public Boolean verticalVelha() {

		
		
		return null;
	}

	@Override
	public Boolean diagonalEsq() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean diagonalDir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void tabu() {

		for(int i=0; i<tabuleiro.length; i++) {
			for(int j=0; j<tabuleiro.length; j++) {
				tabuleiro[i][j] = "-";
				
			}
		}
	}
	
}
