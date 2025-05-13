package Maquinita;

public class UnJugador implements IEstadoVJ{
	
	public void precionarBoton(MaquinaJuegos maquina) {
		if(maquina.getCantFichas() == 1) {
			maquina.setEstado(this);
		}
	}

	public String iniciarJuego() {
		return "Juego en Un jugador";
	}
	
}
