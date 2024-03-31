package playback;

public class CdPlayer implements Playable {
	

	public void play()
	{
		System.out.println("IN CD PLAYER SONG IS PLAYING...");
	}
	
	public void pause()
	{
		System.out.println("IN CD PLAYER SONG IS PAUSED");
	}
	
	public void stop()
	{
		System.out.println("IN CD PLAYER SONG IS STOPED");
	}


}
