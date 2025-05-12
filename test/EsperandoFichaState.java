import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EsperandoFichaState {
	MaquinaJuegos maquina = new MaquinaJuegos();
	EsperandoFicha espeFicha = new EsperandoFicha();
	
	@Test
	public void EsperandoFichaTest() {
		maquina.precionarBoton();
		
		
		assertTrue(maquina.iniciarJuego().equals(espeFicha.iniciarJuego()));
	}
	
	@Test
	public void ingresaFichaDeMas() {
		
		maquina.precionarBoton();
		
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		
		maquina.precionarBoton();
		assertTrue(maquina.iniciarJuego().equals(espeFicha.iniciarJuego()));
	}
	
	@Test
	public void noInicia() {
		
		assertFalse(maquina.iniciarJuego().equals(espeFicha.iniciarJuego()));
	}
}
