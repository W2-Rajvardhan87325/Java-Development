package demo04;

class ObjectGeneric {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}

public class Program {

	public static void main(String[] args) {
		ObjectGeneric obj = new ObjectGeneric();
		obj.setObj(456);
		Integer I1 = (Integer) obj.getObj();
		System.out.println("Integer :" + I1);

		obj.setObj(454.456);
		Double D1 = (Double) obj.getObj();
		System.out.println("Double :" + D1);

		obj.setObj(44.456f);
		Float F1 = (Float) obj.getObj();
		System.out.println("Float :" + F1);

		// Now the Problem is that there is no Type Checking at Compile Time
		obj.setObj("123");
		Float F2 = (Float) obj.getObj();
		System.out.println("String :" + F2);
	}

}
