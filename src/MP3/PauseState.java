package MP3;

public class PauseState implements IEstadoMP3{

	@Override
	public void play(Song song, MP3 mp3) {
		mp3.setEstado(new PlayState());
		song.play();
	}

	@Override
	public void pause(Song song, MP3 mp3){
		System.out.println("ERROR. Ya esta en pausa.");
		
		//throw new IllegalStateException();
	}

	@Override
	public void stop(Song song, MP3 mp3) {
		mp3.setEstado(new StopState());
		song.stop();
	}

}
