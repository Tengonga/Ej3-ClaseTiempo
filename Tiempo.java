public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo() {
        // Constructor vacío
    }

    // Método para establecer los segundos
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    // Método para establecer la hora, minuto y segundo
    public void setTiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    // Método para establecer la hora y minuto
    public void setTiempo(int hora, int minuto) {
        setTiempo(hora, minuto, 0);
    }

    // Método para establecer solo la hora
    public void setTiempo(int hora) {
        setTiempo(hora, 0, 0);
    }

    // Método para crear un objeto Tiempo a partir de segundos
    public void setTiempoFromSegundos(long segundos) {
        this.hora = (int) (segundos / 3600);
        segundos %= 3600;
        this.minuto = (int) (segundos / 60);
        this.segundo = (int) (segundos % 60);
    }

    // Método para obtener una representación textual del tiempo con un formato especificado
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
/*
 Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando
 los tres atributos, solo la hora y minutos y solo la hora. Ademas, tambien debera ser posible crear un
 objeto Tiempo a partir de un número ilimitado de segundos (p.e. 5717 segundos ==> 1h 35min 17seg).
 */
