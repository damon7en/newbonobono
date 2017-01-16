package newPro;

public class max {

	public static void main(String[] args) {

		int[] num = { 57, 5, 10, 7, 63, 9 };
		min(num);
	}

	private static void min(int num[]) {
		int min = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] < min) {
				min = num[i];
			}

		}
		System.out.println(min);

	}

}
