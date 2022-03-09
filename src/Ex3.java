import java.time.LocalDate;
import java.util.Arrays;

public class Ex3 {

    private LocalDate[] datas;

    public Ex3(){
       this.datas = new LocalDate[0];
    }

    public void insereData(LocalDate data){
        datas = Arrays.copyOf(datas, datas.length + 1);
        datas[datas.length-1] = data;
    }

    public void printDatas(){
        for (LocalDate data : datas) {
            System.out.print(data);
        }
    }

    public LocalDate dataMaisProxima(LocalDate data){
        for (int )
    }
}