import java.util.Scanner;

/**
 * Aplicación principal que usa la clase Empleados para gestionar la plantilla.
 */
public class SistemaGestionEmpleados {

    public static void main(String[] args) {
    Empleados empleados = new Empleados(3);

    // Añadir empleados usando la clase Cargo y constantes mínimas
    empleados.altaEmpleado(0, new Empleado("Juan Pérez", Cargo.DESARROLLADOR, 50000));
    empleados.altaEmpleado(1, new Empleado("María López", Cargo.DISENADOR, 45000));
    empleados.altaEmpleado(2, new Empleado("Pedro Gómez", Cargo.GERENTE, 60000));

    Scanner scanner = new Scanner(System.in);
    System.out.print(Textos.INTRODUCIR_PORCENTAJE);
    double porcentaje = scanner.nextDouble();

    empleados.aumentarSalario(porcentaje);

    empleados.mostrarListado();

    scanner.close();
    }
}
