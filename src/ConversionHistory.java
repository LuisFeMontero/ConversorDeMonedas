import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConversionHistory {
    private List<ConversionRecord> records;
    private static final String FILE_NAME = "record.json";

    public ConversionHistory() {
        this.records = new ArrayList<>();
        loadHistory(); // Carga el historial al iniciar
    }

    // Agregar un nuevo registro
    public void addRecord(ConversionRecord record) {
        records.add(record);
        saveHistory(); // Guardar cada vez que se agrega un nuevo registro
    }

    // Guardar el historial en un archivo JSON
    private void saveHistory() {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            // Crear el adaptador personalizado de Gson
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter()) // Registro del adaptador
                    .setPrettyPrinting()
                    .create();

            gson.toJson(records, writer);  // Guarda la lista de registros
        } catch (IOException e) {
            System.out.println("Error al guardar el historial: " + e.getMessage());
        }
    }

    // Cargar el historial desde el archivo JSON
    private void loadHistory() {
        try (FileReader reader = new FileReader(FILE_NAME)) {
            // Crear el adaptador personalizado de Gson
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter()) // Registro del adaptador
                    .create();

            Type recordListType = new TypeToken<ArrayList<ConversionRecord>>(){}.getType();
            records = gson.fromJson(reader, recordListType); // Leer el archivo JSON
            if (records == null) records = new ArrayList<>(); // Si no hay registros, crear una nueva lista
        } catch (IOException e) {
            System.out.println("No se encontró el archivo de historial, creando uno nuevo.");
            records = new ArrayList<>();
        }
    }

    // Mostrar el historial
    public void showHistory() {
        if (records.isEmpty()) {
            System.out.println("No hay registros de conversiones.");
        } else {
            for (ConversionRecord record : records) {
                System.out.println(record.getTimestamp() + " - " + record.getAmount() + " " + record.getFromCurrency() +
                        " a " + record.getResult() + " " + record.getToCurrency());
            }
        }
    }
}
