import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner entradas = new Scanner(System.in);
        System.out.print("Informe um valor monetário: ");
        
        double valor = entradas.nextDouble();

        if (valor < 0 || valor > 1000000.00) {
            System.out.println("O valor monetário deve ser maior ou igaul que 0 e menor ou igual a 1000000.00");
            return;
        }

        int notas100 = (int) (valor / 100);
        valor -= notas100 * 100;
        int notas50 = (int) (valor / 50);
        valor -= notas50 * 50;
        int notas20 = (int) (valor / 20);
        valor -= notas20 * 20;
        int notas10 = (int) (valor / 10);
        valor -= notas10 * 10;
        int notas5 = (int) (valor / 5);
        valor -= notas5 * 5;
        int notas2 = (int) (valor / 2);
        valor -= notas2 * 2;

        int moedas100 = (int) (valor / 1);
        valor -= moedas100 * 1;
        int moedas50 = (int) (valor / 0.5);
        valor -= moedas50 * 0.5;
        int moedas25 = (int) (valor / 0.25);
        valor -= moedas25 * 0.25;
        int moedas10 = (int) (valor / 0.1);
        valor -= moedas10 * 0.1;
        int moedas5 = (int) (valor / 0.05);
        valor -= moedas5 * 0.05;
        int moedas1 = (int) (valor / 0.01);

        System.out.println("NOTAS:");

        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");

        System.out.println(moedas100 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(moedas1 + " moeda(s) de R$ 0.01");

        entradas.close();
    }
}
