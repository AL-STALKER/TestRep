import java.math.BigInteger;
public class calcBigInteger {
	public static void main(String[] args) {
		BigInteger factorial = new BigInteger("1");
		long factorialLong = 1;
		
		for(int i = 1; i <= 25; i++) {
//			String s = ""+i;
			BigInteger bigInt = new BigInteger(""+i);
//			System.out.println(bigInt);
//			System.out.println(s);
			factorial = factorial.multiply(bigInt);
			factorialLong *= i;
			System.out.println(i+"\tBigInteger = "+factorial+"\tLong = "+factorialLong);
		}
//		System.out.println("BigInteger = "+factorial+"\nLong = "+factorialLong);
	}
}
