package ordenaçoes;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 3, 5, 13, 10, 7, 23, 19, -2 };
		int n = arr.length;
		int aux;
		int j;

		// Insertion Sort
		for (int i = 1; i < n; i++) {
			aux = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > aux) {

				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = aux;

		}
		
		// print do array ordenado
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);

		}

	}

}
