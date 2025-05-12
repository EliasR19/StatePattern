

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InicialState {
	MaquinaJuegos maquina = new MaquinaJuegos();
	Inicial ini = new Inicial();
	
	@Test
	public void InicialStateTest() {

		assertTrue(maquina.iniciarJuego().equals(ini.iniciarJuego()));
	}
	
	@Test
	public void  unaFichaInicial() {		

		
		maquina.ingresarFicha();
		maquina.precionarBoton();
		
		assertTrue(maquina.iniciarJuego().equals(ini.iniciarJuego()));
	}
	
	@Test
	public void unJugador() {
		maquina.precionarBoton();
		
		maquina.ingresarFicha();
		maquina.precionarBoton();
		
		assertFalse(maquina.iniciarJuego().equals(ini.iniciarJuego()));
	}
}
