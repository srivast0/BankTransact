package mainaccess;

public interface Transaction {
	public static final Balance b1=new Balance();
	public abstract void process(double amt);
}
