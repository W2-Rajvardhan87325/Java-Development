
public class Demo00 {

	public static void main(String[] args) {
		// convert primitive type in wrapper type(Boxing)
		int primitiveType1 = 123;
		Integer wrapperType1 = new Integer(primitiveType1);
		// convert wrapper type into primitive type(unboxing)
		Integer wrapperType2 = 10;
		int primitiveType2 = wrapperType2.intValue();

		// convert primitive type in wrapper type(auto-Boxing)
		int primitiveType3 = 123;
		Integer wrapperType3 = primitiveType1;
		// convert wrapper type into primitive type(auto-unboxing)
		Integer wrapperType4 = 10;
		int primitiveType4 = wrapperType2;

		int num1 = 10;
		String strNumber = String.valueOf(num1); // Boxing
		System.out.println(strNumber);

		String str = "125";
		int number = Integer.parseInt(str); // unboxing
		System.out.println(number);

	}

}
