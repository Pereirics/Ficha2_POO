import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.out;

public class TestaEx1 {
    /*
    public static void main(String[] args){
        Ficha2 f = new Ficha2();
        Scanner sc = new Scanner(System.in);
        int[] arr;

        out.print("Insira o tamanho do array: ");
        int n = sc.nextInt();
        arr = f.lerArrayInt(n);
        out.println(Arrays.toString(arr));
        out.println("Mínimo: " + f.minimo(arr));

    }
     */
    public static void main(String[] args) {
        Ex1 f = new Ex1();
        Scanner sc = new Scanner(System.in);
        int[] arr1, arr2;
        int tam, tam1;

        out.print("Insira o tamanho do array: ");
        tam = sc.nextInt();
        arr1 = f.lerArrayInt(tam);
        sc.close();

        out.print(Arrays.toString(f.indices(arr1, 3, 6)));

    }
}
