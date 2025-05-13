package Maquinita;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;



public class UnJugadorState {
	
	MaquinaJuegos maquina = new MaquinaJuegos();


	@BeforeEach
	public void setUp() {
	
	}
	
	@Test
	public void UnJugadorTest() {
		UnJugador j1 = new UnJugador();
		maquina.precionarBoton();
		
		maquina.ingresarFicha();
		maquina.precionarBoton();
		
		assertTrue(maquina.iniciarJuego().equals(j1.iniciarJuego()));
	}
	
	@Test
	public void sinIniciar() {
		Inicial ini = new Inicial();
		
		maquina.ingresarFicha();
		maquina.precionarBoton();
		
		assertTrue(maquina.iniciarJuego().equals(ini.iniciarJuego()));
	}
	
	@Test
	public void dosFichas(){
		UnJugador j1 = new UnJugador();
		maquina.precionarBoton();
		
		maquina.ingresarFicha();
		maquina.ingresarFicha();
		
		maquina.precionarBoton();
		
		assertFalse(maquina.iniciarJuego().equals(j1.iniciarJuego()));
	}
	

	
	
}
