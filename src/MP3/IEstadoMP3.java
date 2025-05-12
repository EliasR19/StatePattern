package MP3;

public interface IEstadoMP3 {
	
	public void play(Song song, MP3 mp3);
	public void pause(Song song, MP3 mp3);
	public void stop(Song song, MP3 mp3);
}
