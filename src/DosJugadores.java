
public class DosJugadores implements IEstadoVJ {

	public void precionarBoton(MaquinaJuegos maquina) {
		if(maquina.getCantFichas() == 2) {
			maquina.setEstado(this);
			System.out.println("Empezar juego  Dos Jugadores");
		}
	}

}
