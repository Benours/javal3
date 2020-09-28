package poste;

import java.util.Scanner;

public class testObjetP
{
	public static void main(String[] a)
	{
		Lettre l = new Lettre("Quebec","Montpellier",123,0.1f,0.5f,1,false);
		l.Affichage();
		Colis c = new Colis("Beaucaire","Montreal",164511,0.8f,1.6f,2,"Jeux",100000000);
		c.Affichage();
		ColisExpress ce = new ColisExpress("Tokyo","Singapour",452154,0.5f,20.1f,0,"Livre",20000000,true);
		ce.Affichage();
	}
}
