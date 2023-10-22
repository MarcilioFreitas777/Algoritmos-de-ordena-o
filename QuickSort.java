package ordenaçoes;

public class QuickSort {

	public static int dividir(int arr[], int esquerda, int direita) {
		int aux;
		int pivo = arr[esquerda];
		int i = esquerda + 1;
		int j = direita;

		while (i <= j) {
			if (arr[i] <= pivo) {
				i++;
			} else if (arr[j] > pivo) {
				j--;
			} else if (i <= j) {

				aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;

				i++;
				j--;
			}
		}
		aux = arr[esquerda];
		arr[esquerda] = arr[j];
		arr[j] = aux;
		

		return j;
	}

	public static void quickSort(int arr[], int esquerda, int direita) {
		int j;
		if (esquerda < direita) {
			j = dividir(arr, esquerda, direita);
			quickSort(arr, esquerda, j - 1);
			quickSort(arr, j + 1, direita);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 3, 5, 13, 10, 7, 23, 19, -2, 5 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		
		for(int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}
	}

}
