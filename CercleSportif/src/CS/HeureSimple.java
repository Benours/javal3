package CS;

public class HeureSimple {
	private int H;
	private int M;
	private int granularite;
	
	public HeureSimple(int H, int M) {
		this.H = H;
		this.M = M % granularite;
	}
}
