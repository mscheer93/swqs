package swqs.aufgabe3;

/**
 * Hello world!
 *
 */
public class Calculator implements ICalculator
{

	@Override
	public int add(int x, int y) {
		return x + y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x * y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x / y;
	}
   
}
