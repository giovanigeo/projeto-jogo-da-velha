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
		
		tabuleiro.tabuleiroLinha();
		while(vencedor != true) {
			
			System.out.print("Linha: ");
			int linha = sc.nextInt();
			
			System.out.print("Coluna: ");
			int coluna = sc.nextInt();
			System.out.print("Jogada: ");
			jogador.setJogador(sc.next());
			tabuleiro.getTabuleiro()[linha][coluna] = jogador.getJogador();
			
			vencedor = tabuleiro.horizontalVelha();
			vencedor = tabuleiro.verticalVelha();
			
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
