package oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.printf("Veritabanına loglandı: "+data);
    }
}
