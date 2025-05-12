package MP3;

public class StopState implements IEstadoMP3{

	@Override
	public void play(Song song, MP3 mp3) {
		mp3.setEstado(new PlayState());
		song.play();;
	}

	@Override
	public void pause(Song song, MP3 mp3) {
		System.out.println("ERROR. No hay nada reproduciendoce");
		//throw new IllegalStateException();
	}

	@Override
	public void stop(Song song, MP3 mp3) {
		System.out.println("ERROR.Ya esta en el selector de canciones");
		throw new IllegalStateException();
	}

}
