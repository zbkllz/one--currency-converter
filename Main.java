import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String options = "";

        while (!options.equalsIgnoreCase("7")) {
            System.out.println("******************************************");
            System.out.println("Seja bem-vindo(a) ao Conversor de Moeda :)");
            System.out.println();
            System.out.println("1) Dólar >> Peso Argentino");
            System.out.println("2) Peso Argentino >> Dolar");
            System.out.println("3) Dólar >> Real Brasileiro");
            System.out.println("4) Real Brasileiro >> Dólar");
            System.out.println("5) Dólar >> Peso Colombiano");
            System.out.println("6) Peso Colombiano >> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("******************************************");

            options = scanner.nextLine();

            if (options.equalsIgnoreCase("7")) {
                break;
            }

            System.out.println(
                    "Digite o valor que você deseja converter"
            );
            int amount = scanner.nextInt();

            switch (options) {
                case "1":
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("");
                    break;
                case "5":
                    System.out.println("");
                    break;
                case "6":
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
