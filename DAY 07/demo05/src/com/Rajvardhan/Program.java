package com.Rajvardhan;

class GenericProgramming<PHolder> {
	private PHolder obj;

	public PHolder getObj() {
		return obj;
	}

	public void setObj(PHolder obj) {
		this.obj = obj;
	}

}

public class Program {
	public static void main(String[] args) {
		GenericProgramming<Integer> g1 = new GenericProgramming<>();
		g1.setObj(264);
		Integer I1 = g1.getObj();
		System.out.println("Integer :" + I1);

		
		// It does type Checking at Compile Time
		GenericProgramming<String> g2 = new GenericProgramming<>();
		g2.setObj("Rajvardhan");
		// Double S1 = g2.getObj(); //Gives Error
		String S1 = g2.getObj(); // OK
		System.out.println("String :" + S1);

	}

}
