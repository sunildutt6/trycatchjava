package com.trycatch;

/*public class TryCatchDemo {

	public static void main(String[] args) {

		int[] array = new int[3];
		try {
			array[7] = 3;
			System.out.println("arry index out of bonds");

		} catch (IndexOutOfBoundsException e) {
			System.out.println("The array is of size " + array.length);
		} finally {

			System.out.println("arry index out of bonds");
		}
	}

}*/
//2nd method

public class TryCatchDemo  {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {

		int[] array = new int[3];
		array[7] = 3;
		System.out.println("The array is of size " + array.length);

	}

}