import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Currency currency = new Currency();

        String options = "";

        while (!options.equalsIgnoreCase("7")) {
            System.out.println("""
                    ******************************************
                    Seja bem-vindo(a) ao Conversor de Moedas
                                
                    1) Dólar >> Peso Argentino
                    2) Peso Argentino >> Dolar
                    3) Dólar >> Real Brasileiro
                    4) Real Brasileiro >> Dólar
                    5) Dólar >> Peso Colombiano
                    6) Peso Colombiano >> Dólar
                    7) Dólar >> Peso Chileno
                    8) Peso Chileno >> Dólar
                    9) Sair
                                
                    Escolha uma opção válida:
                    ******************************************
                    """);

            options = scanner.nextLine();

            if (options.equalsIgnoreCase("9")) {
                break;
            }

            System.out.println(
                    "Digite o valor que você deseja converter"
            );
            int amount = scanner.nextInt();

            switch (options) {
                case "1":
                    System.out.println(currency.exchangeCurrency("USD", "ARS", amount));
                    break;
                case "2":
                    System.out.println(currency.exchangeCurrency("ARS", "USD", amount));
                    break;
                case "3":
                    System.out.println(currency.exchangeCurrency("USD", "BRL", amount));
                    break;
                case "4":
                    System.out.println(currency.exchangeCurrency("BRL", "USD", amount));
                    break;
                case "5":
                    System.out.println(currency.exchangeCurrency("USD", "COP", amount));
                    break;
                case "6":
                    System.out.println(currency.exchangeCurrency("COP", "USD", amount));
                    break;
                case "7":
                    System.out.println(currency.exchangeCurrency("USD", "CLP", amount));
                    break;
                case "8":
                    System.out.println(currency.exchangeCurrency("CLP", "USD", amount));
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
