
public class EsperandoFicha implements IEstadoVJ{

	public void precionarBoton(MaquinaJuegos maquina) {
		if(maquina.getCantFichas() == 1) {
			maquina.setEstado(new UnJugador());
			
		} else if(maquina.getCantFichas() == 2){			
			maquina.setEstado(new DosJugadores());
		}
	}

	public String iniciarJuego() {
		return  "Esperando Ficha";
	}

}
