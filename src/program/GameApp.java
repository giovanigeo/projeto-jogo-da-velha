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
			Boolean validacaoJ = false;
			
			System.out.print("Qual jogador você deseja x/o? Digite o jogador: ");
			jogador.setJogador(sc.next());
						
			while(validacaoJ != true) {
				
				if(jogador.getJogador().charAt(0) == 'x' | jogador.getJogador().charAt(0) == 'X' | 
						jogador.getJogador().charAt(0) == 'o' | jogador.getJogador().charAt(0) == 'O') {
					validacaoJ = true;
				}else {
					System.out.print("Jogada invalida. Tente novamente x/o: ");
					jogador.setJogador(sc.next());
					validacaoJ = false;
				}
			}
			
			System.out.println("JOGADOR "+ jogador.getJogador());
			System.out.print("Linha: ");
			
			int linha = sc.nextInt();
			
			System.out.print("Coluna: ");
			int coluna = sc.nextInt();			
			try {
				
				if(tabuleiro.getTabuleiro()[linha][coluna].charAt(0) == '-') {				
					tabuleiro.getTabuleiro()[linha][coluna] = jogador.getJogador();
					
					horizontal = tabuleiro.horizontalVelha(jogador);
					vertical = tabuleiro.verticalVelha(jogador);
					diagonalEsq = tabuleiro.diagonalEsq(jogador);
					diagonalDir = tabuleiro.diagonalDir(jogador);
					
				}else {
					System.out.println("Jogada já existe, não pode ser feita. Tente novamento!");
				}
			}catch(Exception e) {
				System.out.println("Linha ou coluna ivalida: " + e.getMessage());
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
			
			if(vencedor != true) {
				vencedor = tabuleiro.velha();
				if(vencedor == true) {
					vencedor = false;
					System.out.println("Deu velha!!!");
					tabuleiro.tabuleiroLinha();
				}
			}
			
		}
		System.out.println();
		System.out.println("### VENCEDOR!!! ###");
		System.out.println("Ganhador foi: "+ jogador.getJogador());
		System.out.println();
		
		tabuleiro.tabuleiroGanhador(jogador);
		
		for(int i=0; i<tabuleiro.getTabuleiro().length; i++) {
			for(int j=0; j<tabuleiro.getTabuleiro().length; j++) {
				System.out.print(" "+tabuleiro.getTabuleiro()[i][j]);
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}
	
}
