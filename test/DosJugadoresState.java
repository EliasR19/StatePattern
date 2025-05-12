import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class DosJugadoresState {
	
	MaquinaJuegos maquina = new MaquinaJuegos();


	@BeforeEach
	public void setUp() {
	
	}
	
	@Test
	public void UnJugadorTest() {
		DosJugadores j2 = new DosJugadores();
		maquina.precionarBoton();
		
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		
		maquina.precionarBoton();
		
		assertTrue(maquina.iniciarJuego().equals(j2.iniciarJuego()));
	}
	
	@Test
	public void sinIniciar() {
		Inicial ini = new Inicial();
		
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		
		maquina.precionarBoton();
		
		assertTrue(maquina.iniciarJuego().equals(ini.iniciarJuego()));
	}
	
	@Test
	public void unaFichas(){
		DosJugadores j2 = new DosJugadores();
		maquina.precionarBoton();
		
		maquina.ingresarFicha();
		
		maquina.precionarBoton();
		
		assertFalse(maquina.iniciarJuego().equals(j2.iniciarJuego()));
	}
	

}
