package Enemy;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Skeleton extends Enemy{

	

	public Skeleton(int locX, int locY){
		
		super(locX,locY);
		
		setSpeed(6);

		setArmor(10);

		setHealth(500);
		setMaxHealth(500);
		setResourceGiven(100);

		setDebuffDPS(0);

		setResourceGiven(100);
		//moving down images
		enemyImageBuffer[0] = ("/images/enemies/skeleton/skeleton_down/skeleton_down0.png");
		enemyImageBuffer[1] = ("/images/enemies/skeleton/skeleton_down/skeleton_down1.png");
		enemyImageBuffer[2] = ("/images/enemies/skeleton/skeleton_down/skeleton_down2.png");
		enemyImageBuffer[3] = ("/images/enemies/skeleton/skeleton_down/skeleton_down3.png");
		enemyImageBuffer[4] = ("/images/enemies/skeleton/skeleton_down/skeleton_down4.png");
		//moving right images
		enemyImageBuffer[5] = ("/images/enemies/skeleton/skeleton_right/skeleton_right0.png");
		enemyImageBuffer[6] = ("/images/enemies/skeleton/skeleton_right/skeleton_right1.png");
		enemyImageBuffer[7] = ("/images/enemies/skeleton/skeleton_right/skeleton_right2.png");
		enemyImageBuffer[8] = ("/images/enemies/skeleton/skeleton_right/skeleton_right3.png");
		enemyImageBuffer[9] = ("/images/enemies/skeleton/skeleton_right/skeleton_right4.png");
		//moving up images
		enemyImageBuffer[10] = ("/images/enemies/skeleton/skeleton_up/skeleton_up0.png");
		enemyImageBuffer[11] = ("/images/enemies/skeleton/skeleton_up/skeleton_up1.png");
		enemyImageBuffer[12] = ("/images/enemies/skeleton/skeleton_up/skeleton_up2.png");
		enemyImageBuffer[13] = ("/images/enemies/skeleton/skeleton_up/skeleton_up3.png");
		enemyImageBuffer[14] = ("/images/enemies/skeleton/skeleton_up/skeleton_up4.png");
		//die animation
		enemyImageBuffer[15] = ("/images/enemies/skeleton/skeleton_die/skeleton_die0.png");
		enemyImageBuffer[16] = ("/images/enemies/skeleton/skeleton_die/skeleton_die1.png");
		enemyImageBuffer[17] = ("/images/enemies/skeleton/skeleton_die/skeleton_die2.png");

		setEnemyImage(0);
	}
	public void playEnemyDie(){
		
		try {
			dieBuffer = getClass().getResourceAsStream("/sounds/die/skeleton_die.wav");
			dieSound = new AudioStream(dieBuffer);
			AudioPlayer.player.start(dieSound);
		}	catch(Exception exc) {
				exc.printStackTrace();
		}
	}


}
