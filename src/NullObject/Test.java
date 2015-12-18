package NullObject;

import java.util.Scanner;

class Test
{
	public static void main(String[] args)
	{
		IWeapon weapon = null;
		Character MikeAbyss = new Character();
		Scanner scanner = new Scanner(System.in); 
		while (true)
		{

			System.out.println("Choose a weapon for MikeAbyss! (1 = Sword, 2 = Axe, 3 = Club");
			String input = scanner.nextLine();

			switch (input)
			{
			case "1":
				weapon = new Sword();
				break;
			case "2":
				weapon = new Axe();
				break;
			case "3":
				weapon = new Club();
				break;
			default:
				weapon = new Null();
				break;
			}

			MikeAbyss.SetWeapon(weapon);
			MikeAbyss.Attack();
		}
	}
}
