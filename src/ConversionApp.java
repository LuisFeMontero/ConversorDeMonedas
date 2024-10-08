import java.util.Scanner;

public class ConversionApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ConversionHistory history = new ConversionHistory();
    private static final ConversionAPI conversionAPI = new ConversionAPI(); // Instancia de la API

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== Conversor de Monedas =====");
            System.out.println("1. Realizar una conversión");
            System.out.println("2. Ver historial de conversiones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    realizarConversion();
                    break;
                case 2:
                    history.showHistory();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Gracias por usar el conversor de monedas.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }

    private static void realizarConversion() {
        System.out.println("\nSelecciona las monedas a convertir:");
        System.out.println("1. Dólar (USD) a Peso Argentino (ARS)");
        System.out.println("2. Peso Argentino (ARS) a Dólar (USD)");
        System.out.println("3. Dólar (USD) a Real Brasileño (BRL)");
        System.out.println("4. Real Brasileño (BRL) a Dólar (USD)");
        System.out.println("5. Dólar (USD) a Peso Colombiano (COP)");
        System.out.println("6. Peso Colombiano (COP) a Dólar (USD)");
        System.out.println("7. Dólar (USD) a Euro (EUR)");
        System.out.println("8. Euro (EUR) a Dólar (USD)");
        System.out.println("9. Dólar (USD) a Yen Japonés (JPY)");
        System.out.println("10. Yen Japonés (JPY) a Dólar (USD)");
        System.out.println("11. Volver al menú principal");

        int choice = scanner.nextInt();
        String fromCurrency = "";
        String toCurrency = "";

        switch (choice) {
            case 1:
                fromCurrency = "USD";
                toCurrency = "ARS";
                break;
            case 2:
                fromCurrency = "ARS";
                toCurrency = "USD";
                break;
            case 3:
                fromCurrency = "USD";
                toCurrency = "BRL";
                break;
            case 4:
                fromCurrency = "BRL";
                toCurrency = "USD";
                break;
            case 5:
                fromCurrency = "USD";
                toCurrency = "COP";
                break;
            case 6:
                fromCurrency = "COP";
                toCurrency = "USD";
                break;
            case 7:
                fromCurrency = "USD";
                toCurrency = "EUR";
                break;
            case 8:
                fromCurrency = "EUR";
                toCurrency = "USD";
                break;
            case 9:
                fromCurrency = "USD";
                toCurrency = "JPY";
                break;
            case 10:
                fromCurrency = "JPY";
                toCurrency = "USD";
                break;
            case 11:
                return;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.print("Ingrese la cantidad a convertir: ");
        double amount = scanner.nextDouble();

        // Utilizar el método actualizado que devuelve el resultado de la conversión
        double result = conversionAPI.convertirMoneda(fromCurrency, toCurrency, amount);

        if (result != -1) {
            System.out.println("El resultado de la conversión es: " + result + " " + toCurrency);
            ConversionRecord record = new ConversionRecord(fromCurrency, toCurrency, amount, result);
            history.addRecord(record);  // Guardar la conversión en el historial
        } else {
            System.out.println("Error en la conversión.");
        }
    }
}