package playback;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("SELECT THE MUSIC PLAYER:" + "\n1)MP3 PLAYER" + "\n2)CD PLAYER" + "\n3)STREAMING PLAYER"
					+ "\n4)EXIT");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				Mp3Player m = new Mp3Player();
				System.out.println("*****************MP3 PLAYER*****************");
				System.out.println("1)PLAY" + "\n2)PAUSE" + "\n3)STOP");
				int c = sc.nextInt();

				if (c == 1)
					m.play();
				else if (c == 2)
					m.pause();
				else if (c == 3)
					m.stop();
				break;
			case 2:
				CdPlayer cd = new CdPlayer();
				System.out.println("***************CD PLAYER*****************");
				System.out.print("1)PLAY" + "\n2)PAUSE" + "\n3)STOP");
				int c1 = sc.nextInt();

				if (c1 == 1)
					cd.play();
				else if (c1 == 2)
					cd.pause();
				else if (c1 == 3)
					cd.stop();
				break;
			case 3:

				StreamingPlayer s = new StreamingPlayer();
				System.out.println("*************STREAMING PLAYER*****************");
				System.out.print("1)PLAY" + "\n2)PAUSE" + "\n3)STOP");
				int c2 = sc.nextInt();

				if (c2 == 1)
					s.play();
				else if (c2 == 2)
					s.pause();
				else if (c2 == 3)
					s.stop();
				break;

			case 4:
				flag = false;
				break;
			}

		}

	}

}
