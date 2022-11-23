package program;

import java.util.Scanner;

import velhaModel.Jogador;
import velhaModel.Tabuleiro;

public class GameApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuleiro tabuleiro = new Tabuleiro(new String[3][3]);
		Jogador jogador = new Jogador();
				
		Boolean vencedor = false;
		Boolean horizontal = false;
		Boolean vertical = false;
		Boolean diagonalEsq = false;
		Boolean diagonalDir = false;
		
		tabuleiro.tabuleiroLinha();
		while(vencedor != true) {
			
			System.out.print("Linha: ");
			int linha = sc.nextInt();
			
			System.out.print("Coluna: ");
			int coluna = sc.nextInt();
			System.out.print("Jogada: ");
			jogador.setJogador(sc.next());
			
			if(tabuleiro.getTabuleiro()[linha][coluna].charAt(0) == '-') {				
				tabuleiro.getTabuleiro()[linha][coluna] = jogador.getJogador();
				
				horizontal = tabuleiro.horizontalVelha();
				vertical = tabuleiro.verticalVelha();
				diagonalEsq = tabuleiro.diagonalEsq();
				diagonalDir = tabuleiro.diagonalDir();
				
			}else {
				System.out.println("Jogada não pode ser feita. Tente novamento!");
			}
			
			if(horizontal == true) {
				vencedor = horizontal;
			}
			if(vertical == true) {
				vencedor = vertical;
			}
			if(diagonalEsq == true) {
				vencedor = diagonalEsq;
			}
			if(diagonalDir == true) {
				vencedor = diagonalDir;
			}
			
			
			for(int i=0; i<tabuleiro.getTabuleiro().length; i++) {
				for(int j=0; j<tabuleiro.getTabuleiro().length; j++) {
					System.out.print(" "+tabuleiro.getTabuleiro()[i][j]);
				}
				System.out.println();
			}
			
		}
		
		System.out.println("Jogo terminou! ");
		sc.close();
		
	}
	
}
