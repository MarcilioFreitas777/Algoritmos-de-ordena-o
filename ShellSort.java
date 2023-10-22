package ordenaçoes;

public class ShellSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 3, 1, 13, 10, 7, 23, 19, -2, 5 };
		int h, c, j, n;
		
		//Shell sortF
		n = arr.length;
		h = 1;

		while (h < n) {
			h = h * 3;
		}

		h = h / 3;

		while (h > 0) {
			for (int i = h; i < n; i++) {
				c = arr[i];
				j = i;

				while (j >= h && arr[j - h] > c) {
					arr[j] = arr[j - h];
					j = j - h;
				}
				arr[j] = c;
			}
			h = h / 2;
		}

		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}

	}

}
