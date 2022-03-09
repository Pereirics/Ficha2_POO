import java.util.Arrays;

import static java.lang.System.out;

public class Ex2 {
    private final int [][] pauta;

    public Ex2(){
        this.pauta = new int[5][5];
    }

    public void notasAlunos(int aluno, int uc, int nota){
        this.pauta[aluno][uc] = nota;
    }

    public void printNotas(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                out.print(pauta[i][j] + " ");
            }
            out.print("\n");
        }
    }

    public double somaNotasUc(int uc){
        double total = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (j == uc) total += pauta[i][j];
            }
        }
        return total;
    }

    public double mediaAluno(int aluno){
        double total = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == aluno) total += pauta[i][j];
            }
        }
        return (total/5);
    }

    public double mediaUc(int uc){
        return somaNotasUc(uc)/5;
    }

    public int notaAlta(){
        int maior = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (pauta[i][j] > maior) maior = pauta[i][j];
            }
        }
        return maior;
    }

    public int[] acimaValor(int valor){
        int[] result = new int[0];
        int k = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (pauta[i][j] > valor) {
                    result = Arrays.copyOf(result, result.length+1);
                    result[k++] = pauta[i][j];
                }
            }
        }
        return result;
    }

    public String notas(){
        String s = "";
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                s = s + (char)(pauta[i][j] + '0');
            }
        }
        return s;
    }

    public int maiorMedia(){
        double maior = 0;
        int maiorUc = 0;
        for (int i = 0; i < 5; i++){
            if (mediaUc(i) > maior) {
                maior = mediaUc(i);
                maiorUc = i;
            }
        }
        return maiorUc;
    }
}
