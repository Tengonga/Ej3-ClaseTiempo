public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    /*Constructores vacio,tres, dos, un parámetro*/
    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public Tiempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    public Tiempo(int hora) {
        this.hora = hora;
    }
    public Tiempo() {}

    /*Getter y setters*/
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    /*Método toString() sobreescrito*/
    public String toString(int hora, int minuto, int segundo) {
        return String.format("%2dh : %2dmin : %2dseg", hora,minuto,segundo);
    }
    public String toString(int hora, int minuto) {
        return String.format("%2dh : %2dmin : %2dseg", hora,minuto);
    }
     public String toString(int tiempoSegundos) {// Aquí ingresas la cantidad de segundos que deseas convertir
        int hora = tiempoSegundos / 3600;
        int restoHora = tiempoSegundos % 3600;
        int minuto = restoHora / 60;
        int segundo = restoHora % 60;
        return String.format("%2dh : %2dmin : %2dseg", hora,minuto,segundo);
    }
    public String toString() {
        return String.format("%2dh : %2dmin : %2dseg", hora,minuto,segundo);
    }


}

/*
 Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser construida indicando
 los tres atributos, solo la hora y minutos y solo la hora. Ademas, tambien debera ser posible crear un
 objeto Tiempo a partir de un número ilimitado de segundos (p.e. 5717 segundos ==> 1h 35min 17seg).
 */
