package MP3;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;


public class PlayTest {
	MP3 mp3 = new MP3();
	PlayState playS = Mockito.spy(PlayState.class);
	
	
	
	Song song1 = new Song();
	
	@BeforeEach
	public void setUp() {
		mp3.play(song1);
	}
	
	@Test
	public void reproducirSeleccion() {

		mp3.play(song1);
		
		verify(playS).play(song1, mp3);

		
		
		
//		Song song2 = new Song();
//		PlayState playS = new PlayState();
//		PlayState pS = Mockito.spy(playS);

//		
//		doAnswer(new Answer() {
//
//			@Override
//			public Object answer(InvocationOnMock arg0) throws Throwable {
//				//throw new Exception("Entro");
//				System.out.println("Entro");
//				return null;
//			}
//
//			
//		}).when(spy).play(song1, mp3);
//		
//		spy.stop(song1, mp3);
//		
//		IllegalStateException exception = assertThrows(IllegalStateException.class, 
//				() -> mp3.play(song1));
		

	}
}
