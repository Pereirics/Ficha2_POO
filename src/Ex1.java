import java.util.Scanner;
import static java.lang.System.out;

public class Ex1 {

    public int[] lerArrayInt(int n){
        Scanner sc = new Scanner(System.in);
        int[] res = new int[n];

        for(int i=0; i<n; i++) {
            out.format("Valor na posição %d: ", i);
            res[i] = sc.nextInt();
        }
        return res;
    }

    /**
     * Pré-condição: valores.length > 0
     */
    public int minimo(int[] valores){
        int min = Integer.MAX_VALUE;
        for(int v: valores) {
            if (v < min) min = v;
        }
        return min;
    }

    public int[] indices(int[] v, int a, int b){
        int[] res = new int[b-a];
        int j = 0;

        for(int i= a; i < b; i++){
            res[j++] = v[i];
        }
        return res;
    }

    private boolean procura(int v, int[] arr, int tam){
        boolean found = false;

        for (int i = 0; i < tam && !found; i++){
            found = arr[i] == v;
        }
        return found;
    }

    public int[] comuns(int[] a, int[] b){
        int[] res = new int[Integer.min(a.length, b.length)];
        int tam = 0;

        for(int va : a){
            if (!procura(va, res, tam)){
                if (procura(va, b, b.length)) {
                    res[tam++] = va;
                }
            }
        }
        int[] realRes = new int[tam];
        System.arraycopy(res, 0, realRes, 0, tam);
        return realRes;
    }

}
