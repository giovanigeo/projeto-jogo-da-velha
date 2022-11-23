package velhaModel;

import java.util.Objects;

public class Jogador {

	private String jogador;
	
	public Jogador () {
	}
	
	public Jogador (String jogador) {
		this.jogador = jogador;
		
	}
	
	
	public String getJogador() {
		return jogador;
	}
	
	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(jogador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(jogador, other.jogador);
	}
	
	
}
