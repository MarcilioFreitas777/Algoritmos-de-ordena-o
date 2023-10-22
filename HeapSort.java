package ordenaçoes;

public class HeapSort {

	public static void heapify(int arr[], int n, int i) {
		int Fe = 2 * i;
		int Fd = 2 * i + 1;
		int raiz = i;
		int aux2;

		if (Fe < n && arr[Fe] > arr[raiz]) {
			raiz = Fe;
		} 
		
		if (Fd < n && arr[Fd] > arr[raiz]) {
			raiz = Fd;
		}

		if (raiz != i) {
			aux2 = arr[i];
			arr[i] = arr[raiz];
			arr[raiz] = aux2;

			heapify(arr, n, raiz);
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 3, 5, 13, 10, 7, 23, 19, -2, 5 };
		int n = arr.length;
		int aux1;

		// Heap Sort

		for (int i = n / 2; i >= 0; i--) {
			heapify(arr, n, i);
		}

		for (int j = n - 1; j > 0; j--) {
			aux1 = arr[0];
			arr[0] = arr[j];
			arr[j] = aux1;
			
			heapify(arr, j, 0);

		}

		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}
	}

}
