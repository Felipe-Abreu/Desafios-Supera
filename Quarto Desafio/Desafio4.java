import java.util.Scanner;

public class Desafio4 {

  public static void main(String[] args) {

    Scanner entradas = new Scanner(System.in);
    System.out.print("Informe a quantidade de frases embaralhadas: ");

    int n = entradas.nextInt();
    entradas.nextLine();

    for (int i = 0; i < n; i++) {

      System.out.print("Informe a " + (i+1) + "º frase a ser decifrada: ");
      String embaralhada = entradas.nextLine();

      if (embaralhada.length() >= 2 && embaralhada.length() <= 100 && embaralhada.length() % 2 == 0) {

        int tamanho = embaralhada.length();

        StringBuilder stringBuilder = new StringBuilder(tamanho);

        for (int j = tamanho / 2 - 1; j >= 0; j--) {
          stringBuilder.append(embaralhada.charAt(j));
        }

        for (int j = tamanho - 1; j >= tamanho / 2; j--) {
          stringBuilder.append(embaralhada.charAt(j));
        }

        System.out.println(stringBuilder.toString());

      } else {

        System.out.println("A frase deve ter entre 2 e 100 caracteres e ter um nC:mero par de caracteres.");

      }
    }

    entradas.close();

  }
}