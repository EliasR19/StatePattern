
public class UnJugador implements IEstadoVJ{
	
	public void precionarBoton(MaquinaJuegos maquina) {
		if(maquina.getCantFichas() == 1) {
			System.out.println("Empezar juego Un jugador");
			maquina.setEstado(this);
		}
	}
	
}
