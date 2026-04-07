import java.util.Scanner;

void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE MATRIZES E ORDENAÇÃO");

        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        Matriz matriz = new Matriz(linhas, colunas);

        System.out.println("Escolha o tipo de preenchimento:");
        System.out.println("1 - Manual");
        System.out.println("2 - Automático");
        System.out.print("Opção: ");
        int opcaoPreenchimento = sc.nextInt();

        if (opcaoPreenchimento == 1) {
            matriz.preencherManual(sc);
        } else {
            matriz.preencherAutomatico();
        }

        System.out.println("Matriz original:");
        matriz.exibir();

        int opcaoAlgoritmo;
        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Merge Sort");
        System.out.print("Opção: ");
        opcaoAlgoritmo = sc.nextInt();

        int opcaoOrdenacao;
        System.out.println("Escolha como ordenar:");
        System.out.println("1 - Ordenar por linhas");
        System.out.println("2 - Ordenar por colunas");
        System.out.println("3 - Ordenar matriz completa");
        System.out.print("Opção: ");
        opcaoOrdenacao = sc.nextInt();

        if (opcaoOrdenacao == 1) {
            ordenarPorLinhas(matriz, opcaoAlgoritmo);
            System.out.println("Matriz ordenada por linhas:");
            matriz.exibir();
        } else if (opcaoOrdenacao == 2) {
            ordenarPorColunas(matriz, opcaoAlgoritmo);
            System.out.println("Matriz ordenada por colunas:");
            matriz.exibir();
        } else if (opcaoOrdenacao == 3) {
            ordenarMatrizCompleta(matriz, opcaoAlgoritmo);
            System.out.println("Matriz ordenada como vetor:");
            matriz.exibir();
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }

    public static void ordenarPorLinhas(Matriz matriz, int algoritmo) {
        for (int i = 0; i < matriz.getLinhas(); i++) {
            int[] linha = matriz.getLinha(i);

            if (algoritmo == 1) {
                Ordenacao.bubbleSort(linha);
            } else {
                Ordenacao.mergeSort(linha, 0, linha.length - 1);
            }

            matriz.setLinha(i, linha);
        }
    }

    public static void ordenarPorColunas(Matriz matriz, int algoritmo) {
        for (int j = 0; j < matriz.getColunas(); j++) {
            int[] coluna = matriz.getColuna(j);

            if (algoritmo == 1) {
                Ordenacao.bubbleSort(coluna);
            } else {
                Ordenacao.mergeSort(coluna, 0, coluna.length - 1);
            }

            matriz.setColuna(j, coluna);
        }
    }

    public static void ordenarMatrizCompleta(Matriz matriz, int algoritmo) {
        int[] vetor = matriz.achatar();

        if (algoritmo == 1) {
            Ordenacao.bubbleSort(vetor);
        } else {
            Ordenacao.mergeSort(vetor, 0, vetor.length - 1);
        }

        matriz.reconstruir(vetor);
    }
