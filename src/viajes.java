import java.util.Scanner; //Ejercicio 19//
public class viajes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("¿Tiene pasaporte? (1 para sí, 0 para no): ");
        int Pasaporte = sc.nextInt();
        if (edad > 18 && Pasaporte == 1) {
            System.out.println("Puede viajar");
        } else {
            System.out.println("No puede viajar");//arroja si puede viajar
        }
    }
}

