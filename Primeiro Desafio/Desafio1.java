import java.util.*;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.print("Informe quantidade de entradas: ");
        int n = entradas.nextInt();
        if (n < 2 || n > 100000) {
            System.out.println("A quantidade de entradas deve ser maior que 1 e menor ou igual a 10⁵");
            return;
        }
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        System.out.println("------------- Entradas -------------");
        for (int i = 0; i < n; i++) {
            int x = entradas.nextInt();
            if (x % 2 == 0) {
                pares.add(x);
            } else {
                impares.add(x);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());
        System.out.println("------------- Ordenando -------------");
        for (int x : pares) {
            System.out.println(x);
        }
        for (int x : impares) {
            System.out.println(x);
        }
    }
}
