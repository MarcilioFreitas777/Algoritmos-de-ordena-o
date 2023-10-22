package ordena�oes;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 5, 20, 15, -2, 1, 7, 6 };
		int n = arr.length;
		int pmenor;// variav�l que significa posi�ao menor, usada para identificar um n�mero
					// que seja menor no array
		int aux;

		// Selection sort
		for (int i = 0; i < n - 1; i++) {
			pmenor = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[pmenor]) { // se o num na posi�ao j for menor que o menor atual
					pmenor = j; // o indice de menor posi��o � atualizado
				}
			}
			// parte onde ocorre a troca
			aux = arr[pmenor];
			arr[pmenor] = arr[i];
			arr[i] = aux;

		}
		// print do array ordenado
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}

	}
}
