 package Tower;

public class PoisonTower extends Tower{
	
	public PoisonTower(){
		super();
		setImage("/images/towers/poison_tower.png");
		setDamage(100);
		setTowerRange(125);
		setAttackSpeed(25);
	}

}
