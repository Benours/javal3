
public class ErrNat extends Exception{
	int n;
	public ErrNat(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
}
