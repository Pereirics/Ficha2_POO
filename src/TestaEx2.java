import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class TestaEx2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ex2 f = new Ex2();

        for (int i = 0; i < 5; i++) {
            out.format("Insira as notas do aluno %d: ", i);
            for (int j = 0; j < 5; j++) {
               f.notasAlunos(i, j, sc.nextInt());
            }
        }
        out.print(f.maiorMedia());
    }
}
