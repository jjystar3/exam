package main;

public class Quiz4 {

	public static void main(String[] args) {

		int[] arr1 = new int[5];
		arr1 = new int[] { 2, 4, 6, 8, 10 };
		System.out.println("첫번째 배열의 합계: " + sum(arr1));

		int[] arr2 = new int[2];
		arr2 = new int[] { 2, 4 };
		System.out.println("두번째 배열의 합계: " + sum(arr2));

	}

	public static int sum(int[] arr) {

		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		
		if (arr.length < 3) {
			return -999;
		}
		
		return result;

	}

}
