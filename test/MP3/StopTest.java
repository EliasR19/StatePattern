package MP3;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class StopTest {
	MP3 mp3 = new MP3();
	Song song = new Song();
	StopState stop = new StopState();
	
	@BeforeEach
	public void setUp() {
		mp3.setEstado(stop);
	}
	
	@Test
	public void testStopAPlay() {
		mp3.setEstado(stop);
		assertDoesNotThrow( () -> mp3.play(song) );
	}
	
	@Test
	public void testStopAStop() {
		mp3.setEstado(stop);
		assertThrows( IllegalStateException.class, () -> mp3.stop(song));
	}
	
	@Test
	public void testStopAPause() {
		mp3.setEstado(stop);
		assertThrows( IllegalStateException.class, () -> mp3.pause(song));
	}
}
