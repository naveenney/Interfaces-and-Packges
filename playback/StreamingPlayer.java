package playback;

public class StreamingPlayer implements Playable{
	

	public void play()
	{
		System.out.println("IN STREAMING PLAYER SONG IS PLAYING...");
	}
	
	public void pause()
	{
		System.out.println("IN STREAMING PLAYER SONG IS PAUSED");
	}
	
	public void stop()
	{
		System.out.println("IN STREAMING PLAYER SONG IS STOPED");
	}


}
