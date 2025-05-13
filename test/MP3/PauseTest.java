package MP3;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PauseTest {
	MP3 mp3 = new MP3();
	Song song = mock(Song.class);
	PauseState pause = new PauseState();
	
	@BeforeEach
	public void setUp() {
	}
	
	@Test
	public void testPauseAPlay() {
		mp3.setEstado(pause);
		assertDoesNotThrow( () -> mp3.play(song));
	}
	
	@Test
	public void testPauseAStop() {
		mp3.setEstado(pause);
		assertDoesNotThrow( () -> mp3.stop(song));
	}
	
	@Test
	public void testPauseAPause() {
		mp3.setEstado(pause);
		assertThrows( IllegalStateException.class, () -> mp3.pause(song));
	}
}
