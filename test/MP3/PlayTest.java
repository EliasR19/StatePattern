package MP3;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


public class PlayTest {
	MP3 mp3 = new MP3();
	Song song1 = new Song();
	PlayState play = new PlayState();
	
	@BeforeEach
	public void setUp() {
	}
	
	@Test
	public void testPlayAStop() {
		mp3.setEstado(play);
		assertDoesNotThrow( () -> mp3.stop(song1));
	}

	@Test
	public void testPlayAPause() {
		mp3.setEstado(play);
		assertDoesNotThrow( () -> mp3.pause(song1));
	}
	
	@Test
	public void testPlayAPlay() {
		mp3.setEstado(play);
		assertThrows(IllegalStateException.class, () -> mp3.play(song1));
	}
	
}
