import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doReturn;

import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;


public class UnJugadorState {
	
	MaquinaJuegos maquina = new MaquinaJuegos();
	UnJugador j1 = Mockito.mock(UnJugador.class);
	
	UnJugador jA= new UnJugador();
	UnJugador spy = Mockito.spy(jA);
	@BeforeEach
	public void setUp() {
	
	}
	
	@Test
	public void UnJugadorTest() {
		maquina.precionarBoton();
		
		maquina.ingresarFicha();
		maquina.precionarBoton();
		
		Mockito.doNothing().when(spy).precionarBoton(maquina);
		/*doAnswer(new Answer<Void>() {
			public Void answer(InvocationOnMock invocation) {
			      Object[] args = invocation.getArguments();
			      System.out.println("called with arguments: " + Arrays.toString(args));
				return null;
			}
		}).when(j1).precionarBoton(maquina);
		*/
	}
	
}
