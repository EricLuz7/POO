import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] a = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int [] b = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        int []va = {3,5,7,9,11,13,15,17};
        int []vb = new int[8];
        System.out.println();
        System.arraycopy(va,4,vb,0,4);
        for (int i = 0; i < vb.length; i++) {
            System.out.print(vb[i] + " ");
        }
        System.out.println();
        int[]vc = new int[30];
        Arrays.fill(vc,18);
        for (int i = 0; i < vc.length; i++) {
            System.out.print(vc[i] + " ");
        }
        System.out.println();
        int[]vd = {30,34,23,6,13,1,35};
        List<Integer> lista = new ArrayList<>();
        lista.add(23);
        lista.add(6);
        lista.add(34);
        lista.add(13);
        Collections.sort(lista);
        for (Integer x : lista) System.out.println(x);
    }
}