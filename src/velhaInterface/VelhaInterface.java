package velhaInterface;

import velhaModel.Jogador;

public interface VelhaInterface {

	public Boolean horizontalVelha(Jogador jogador);
	
	public Boolean verticalVelha(Jogador jogador);
	
	public Boolean diagonalEsq(Jogador jogador);
	
	public Boolean diagonalDir(Jogador jogador);
	
	public void tabuleiroLinha();
	
	public void tabuleiroGanhador(Jogador jogador);
}
