package AbstractFactory;

//With an Abstract Factory Pattern you won't
//just build ships, but also all of the components
//for the ships
public interface EnemyShipFactory{
	
	public ESWeapon addESGun();
	public ESEngine addESEngine();
	
}