import javax.swing.event.SwingPropertyChangeSupport;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        int hora;
        int minuto;
        int segundo;
        int tiempoSegundos;

        //Objeto
        Tiempo reloj1 = new Tiempo();
        Tiempo reloj2 = new Tiempo();
        Tiempo reloj3 = new Tiempo(4);
        Tiempo reloj4 = new Tiempo();


            //seleccionar formato
            System.out.println("-----------------------------");
            System.out.println("Selecione el formato de tiempo: ");
            System.out.println("[1] Horas, minutos, segundos");
            System.out.println("[2] Horas, minutos");
            System.out.println("[3] Horas");
            System.out.println("[4] segundos");
            System.out.println("-----------------------------");
            int formato = tec.nextInt();
            tec.nextLine();

            switch (formato) {
                case 1:
                    System.out.println("Hora: ");
                    hora = tec.nextInt();
                    System.out.println("Minutos: ");
                    minuto = tec.nextInt();
                    System.out.println("Segundos: ");
                    segundo = tec.nextInt();

                    System.out.println("Reloj 1: "+reloj1.toString());
                    break;
                case 2:
                    System.out.println("Hora: ");
                    hora = tec.nextInt();
                    System.out.println("Minutos: ");
                    minuto = tec.nextInt();

                    System.out.println("Reloj 2: "+reloj2.toString());
                    break;
                case 3:
                    System.out.println("Hora: ");
                    hora = tec.nextInt();

                    System.out.println("Reloj 3: "+reloj3.toString());
                    break;
                case 4:
                    System.out.println("Segundos: ");
                    tiempoSegundos = tec.nextInt();
                    System.out.println("Reloj 4: "+reloj4.toString(tiempoSegundos));
                    break;
                default:
                    System.out.println("Formato no admitido. Por favor, seleccione 1,2,3,4: ");
                    break;
            }

            tec.close();

    }
}
