package MP3;

public class MP3 {
	
	private IEstadoMP3 estado;
	
	public MP3() {
		estado = new StopState();
	}
	
	public void setEstado(IEstadoMP3 estado) {
		this.estado = estado;
	}
	
	
	public void play(Song song) {
		estado.play(song, this);
	}
	
	public void pause(Song song) {
		estado.pause(song, this);
	}
	
	public void stop(Song song) {
		estado.stop(song, this);
	}
	
}
