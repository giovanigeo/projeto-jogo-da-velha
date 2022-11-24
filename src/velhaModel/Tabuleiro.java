package velhaModel;

import velhaInterface.VelhaInterface;

public class Tabuleiro implements VelhaInterface {

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
	public Boolean horizontalVelha(Jogador jogador) {

		for (int i = 0; i < tabuleiro.length; i++) {
			int n = 0;
			for (int j = 0; j < tabuleiro.length; j++) {
				if (tabuleiro[i][j].charAt(0) == jogador.getJogador().charAt(0)) {
					n++;
					if (n == 3) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Boolean verticalVelha(Jogador jogador) {
		for (int i = 0; i < tabuleiro.length; i++) {
			int n = 0;
			for (int j = 0; j < tabuleiro.length; j++) {
				if (tabuleiro[j][i].charAt(0) == jogador.getJogador().charAt(0)) {

					n++;
					if (n == 3) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public Boolean diagonalEsq(Jogador jogador) {
		int n = 0;
		for (int j = 0; j < tabuleiro.length; j++) {
			if (tabuleiro[j][j].charAt(0) == jogador.getJogador().charAt(0)) {
				n++;
				if (n == 3) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Boolean diagonalDir(Jogador jogador) {
		int n = 0;
		for (int i = 0; i < tabuleiro.length; i++) {
			if (tabuleiro[i][tabuleiro.length - 1 - i].charAt(0) == jogador.getJogador().charAt(0)) {
				n++;
				if (n == 3) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void tabuleiroLinha() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				tabuleiro[i][j] = "-";

			}
		}
	}

	@Override
	public Boolean velha() {
		int n = 0;
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro.length; j++) {
				if (tabuleiro[i][j].charAt(0) != '-') {

					n++;
					if (n == 9) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
