package CS;

public class Creneau {
	private Jour jour;
	private HeureSimple Hdebut;
	private HeureSimple Hfin;
	
	public Creneau(Jour jour, HeureSimple hd, HeureSimple hf) {
		this.jour = jour;
		this.Hdebut = hd;
		this.Hfin = hf;
	}
}
