package MP3;

public class PlayState implements IEstadoMP3{

	@Override
	public void play(Song song, MP3 mp3) {
		System.out.println("ERROR. Ya se esta reproduciendo!");
		throw new IllegalStateException();
	}

	@Override
	public void pause(Song song, MP3 mp3) {
		mp3.setEstado(new PauseState());
		song.pause();
	}

	@Override
	public void stop(Song song, MP3 mp3) {
		mp3.setEstado(new StopState());
		song.stop();
	}

}
