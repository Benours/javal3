import java.io.*;
import java.util.Scanner;


public class EntNat extends Exception {
	private int entier = 0;

	public EntNat(int n) throws ErrConst{
		if (n < 0) throw new ErrConst(n);
		entier = n;
	}

	public int getNat() {
		return entier;
	}

	public void setNat(int n) throws ErrModif{
		if (n == 0) throw new ErrModif(n); 
		entier = n;

	}

	public void decremente() throws ErrModif{
		if (entier == 0) throw new ErrModif(entier);
		entier--;
	}

	public static EntNat decremente(EntNat e) throws ErrConst, ErrModif{
		if (e.entier == 0) throw new ErrModif(e.entier);
		e.setNat(e.getNat() - 1);
		return e;
	}
	
	public static void main(String args[]) {
		//ErrConst
		
		try {
		EntNat e = new EntNat(-1);
  		e.decremente();
		}
		catch (ErrConst c) {
			System.out.println("ErrConst : negative number " + c.getN());
		}
		catch (ErrModif m) {
			System.out.println("ErrModif : try to change " + m.getN() + " to negative number " );
		}
		
		//ErrModif
		
		try {
			EntNat f = new EntNat(0);
			decremente(f);
		}
		catch (ErrConst c) {
			System.out.println("ErrConst : negative number " + c.getN());
		}
		catch (ErrModif m) {
			System.out.println("ErrModif : try to change " + m.getN() + " to negative number " );
		}
	}
}
