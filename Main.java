import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int hora, minuto, segundo;

        System.out.println("Selecciona el formato de introducción:");
        System.out.println("1. Hora, Minutos, Segundos");
        System.out.println("2. Hora, Minutos");
        System.out.println("3. Hora");
        System.out.println("4. Segundos");
        System.out.print("Introduce el número del formato: ");

        int formato = tec.nextInt();

        Tiempo tiempo = new Tiempo();

        switch (formato) {
            case 1:
                System.out.print("Introduce la hora: ");
                hora = tec.nextInt();
                System.out.print("Introduce los minutos: ");
                minuto = tec.nextInt();
                System.out.print("Introduce los segundos: ");
                segundo = tec.nextInt();
                tiempo.setTiempo(hora, minuto, segundo);
                break;
            case 2:
                System.out.print("Introduce la hora: ");
                hora = tec.nextInt();
                System.out.print("Introduce los minutos: ");
                minuto = tec.nextInt();
                tiempo.setTiempo(hora, minuto);
                break;
            case 3:
                System.out.print("Introduce la hora: ");
                hora = tec.nextInt();
                tiempo.setTiempo(hora);
                break;
            case 4:
                System.out.print("Introduce los segundos: ");
                long segundos = tec.nextLong();
                tiempo.setTiempoFromSegundos(segundos);
                break;
            default:
                System.out.println("Formato no válido");
                return;
        }

        System.out.println("-----------------------------");
        System.out.println("Tiempo: " + tiempo);
        System.out.println("-----------------------------");
    }
}