package newPro;

public class max {

	public static void main(String[] args) {

		int[] num = { 57, 5, 10, 7, 63, 9 };
		max(num);
	}

	private static void max(int num[]) {
		int max = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {
				max = num[i];
			}

		}
		System.out.println(max);

	}

}
