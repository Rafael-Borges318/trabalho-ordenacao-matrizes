import java.util.Random;
import java.util.Scanner;

public class Matriz {
    private int[][] dados;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.dados = new int[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public int[][] getDados() {
        return dados;
    }

    public void preencherManual(Scanner sc) {
        System.out.println("Preenchimento manual da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                dados[i][j] = sc.nextInt();
            }
        }
    }

    public void preencherAutomatico() {
        Random random = new Random();

        System.out.println("Preenchimento automático da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = random.nextInt(100); // 0 até 99
            }
        }
    }

    public void exibir() {
        System.out.println();
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(dados[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int[] getLinha(int indiceLinha) {
        int[] linha = new int[colunas];
        for (int j = 0; j < colunas; j++) {
            linha[j] = dados[indiceLinha][j];
        }
        return linha;
    }

    public void setLinha(int indiceLinha, int[] linha) {
        for (int j = 0; j < colunas; j++) {
            dados[indiceLinha][j] = linha[j];
        }
    }

    public int[] getColuna(int indiceColuna) {
        int[] coluna = new int[linhas];
        for (int i = 0; i < linhas; i++) {
            coluna[i] = dados[i][indiceColuna];
        }
        return coluna;
    }

    public void setColuna(int indiceColuna, int[] coluna) {
        for (int i = 0; i < linhas; i++) {
            dados[i][indiceColuna] = coluna[i];
        }
    }

    public int[] achatar() {
        int[] vetor = new int[linhas * colunas];
        int k = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[k] = dados[i][j];
                k++;
            }
        }

        return vetor;
    }

    public void reconstruir(int[] vetor) {
        int k = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = vetor[k];
                k++;
            }
        }
    }
}