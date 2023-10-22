package ordenaçoes;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 1, 3, 5, 13, 10, 7, 23, 19, -2 };
		int n = arr.length;
		int aux;
		
		//Bubble Sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {  
					
					aux = arr[j];     //parte onde a troca dos elementos do array é feita   
					arr[j] = arr[i];
					arr[i] = aux;

				}

			}

		}
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}

	}

}
