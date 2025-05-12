package MP3;

public class Main {
	public static void main(String[] args) {
		
		MP3 mp3 = new MP3();
		Song song1 = new Song();
		
		mp3.play(song1);
		
		mp3.pause(song1);
	}
}
