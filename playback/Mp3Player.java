package playback;

public class Mp3Player implements Playable {
	
	public void play()
	{
		System.out.println("IN MP3 PLAYER SONG IS PLAYING...");
	}
	
	public void pause()
	{
		System.out.println("IN MP3 PLAYER SONG IS PAUSED");
	}
	
	public void stop()
	{
		System.out.println("IN MP3 PLAYER SONG IS STOPED");
	}

}
