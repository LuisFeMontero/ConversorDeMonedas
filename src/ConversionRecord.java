import java.time.LocalDateTime;

public class ConversionRecord {
    private String fromCurrency;
    private String toCurrency;
    private double amount;
    private double result;
    private LocalDateTime timestamp;

    public ConversionRecord(String fromCurrency, String toCurrency, double amount, double result) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
        this.result = result;
        this.timestamp = LocalDateTime.now(); // Marca de tiempo actual
    }

    public String getFromCurrency() { return fromCurrency; }
    public String getToCurrency() { return toCurrency; }
    public double getAmount() { return amount; }
    public double getResult() { return result; }
    public LocalDateTime getTimestamp() { return timestamp; }
}
