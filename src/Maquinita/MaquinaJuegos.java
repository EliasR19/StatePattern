package Maquinita;

public class MaquinaJuegos {
	private IEstadoVJ state;
	private int cantFichas = 0;
	
	public MaquinaJuegos() {
		state = new Inicial();

	}
	
	public void setEstado(IEstadoVJ state) {
		this.state = state;
	}
	
	public void ingresarFicha() {
		cantFichas++;
	}
	
	public void precionarBoton() {
		state.precionarBoton(this);
	}
	
	public String iniciarJuego() {
		return state.iniciarJuego();
	}
	
	public void terminarJuego() {
		this.setEstado(new Inicial());
		cantFichas = 0;
	}
	
	public int getCantFichas() {
		return cantFichas;
	}

}


/*
 * 
 *  if(PresionaBoton y fichas == 1) -> UnJugador
 *  if(PresionaBoton y ficha == 2) -> DosJugadores
 *  else if(presionaBoton) -> Espera
 */
