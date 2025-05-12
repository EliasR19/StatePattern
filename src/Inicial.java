
public class Inicial implements IEstadoVJ{
	
	public void precionarBoton(MaquinaJuegos maquina) {
		if(maquina.getCantFichas() == 0) {
			maquina.setEstado(new EsperandoFicha());
		}
	}
}
