
public class DosJugadores implements IEstadoVJ {

	public void precionarBoton(MaquinaJuegos maquina) {
		if(maquina.getCantFichas() == 2) {
			maquina.setEstado(this);
		}
	}

	@Override
	public String iniciarJuego() {
		return "Juego en Dos Jugadores";
	}

}
