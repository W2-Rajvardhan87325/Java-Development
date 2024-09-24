package com.Rajvardhan;

//Bounded Generic Class
class GenericProgramming<PHolder extends Number> {
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
		// GenericProgramming<?> g1 = new GenericProgramming<Integer>();
		// g1.getObj();

		// Lower Bounded
//		GenericProgramming<? super Integer> g1 = new GenericProgramming<>();
		// Upper Bounded
//		GenericProgramming<? extends Number> g2 = new GenericProgramming<>();

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				System.out.print("\t" + i);
		}

	}
}
