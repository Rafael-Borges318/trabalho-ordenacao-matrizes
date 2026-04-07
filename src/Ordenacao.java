public class Ordenacao {

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);

            merge(vetor, inicio, meio, fim);
        }
    }

    private static void merge(int[] vetor, int inicio, int meio, int fim) {
        int tamanhoEsq = meio - inicio + 1;
        int tamanhoDir = fim - meio;

        int[] esquerda = new int[tamanhoEsq];
        int[] direita = new int[tamanhoDir];

        for (int i = 0; i < tamanhoEsq; i++) {
            esquerda[i] = vetor[inicio + i];
        }

        for (int j = 0; j < tamanhoDir; j++) {
            direita[j] = vetor[meio + 1 + j];
        }

        int i = 0, j = 0, k = inicio;

        while (i < tamanhoEsq && j < tamanhoDir) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }

        while (i < tamanhoEsq) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < tamanhoDir) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }
}