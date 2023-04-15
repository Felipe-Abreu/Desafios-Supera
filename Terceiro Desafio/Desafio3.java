import java.util.*;

public class Desafio3 {

    static int countPairs(int[] arr, int k) {

        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] - k)) {
                count++;
            }
            if (set.contains(arr[i] + k)) {
                count++;
            }
            set.add(arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do array: ");
        int n = scanner.nextInt();

        System.out.print("Informe o valor desejado da diferença: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o " + (i+1) + "º valor do array: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("A quantidade de pares referente a diferença é: " + countPairs(arr, k));
        scanner.close();
    }
}
