import java.time.LocalDate;
import java.util.Scanner;
import static java.lang.System.out;

public class TestaEx3 {
    public static void main(String[] args){
        Ex3 data= new Ex3();
        Scanner sc = new Scanner(System.in);
        out.print("Insira o ano: ");
        int ano = sc.nextInt();
        out.print("Insira o mês: ");
        int mes = sc.nextInt();
        out.print("Insira o dia: ");
        int dia = sc.nextInt();
        LocalDate date = LocalDate.of(ano, mes, dia);
        data.insereData(date);
        data.printDatas();
    }
}
