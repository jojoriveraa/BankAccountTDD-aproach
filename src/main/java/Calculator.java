
public class Calculator {

	public double divide(int a, int b) {
		if (b == 0){
			throw new IllegalArgumentException();
		}
		return (a/b);
	}
	
}
