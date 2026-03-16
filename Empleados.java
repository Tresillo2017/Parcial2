/**
 * Clase que gestiona la colección de empleados y operaciones sobre ellos.
 */
public class Empleados {

    /** Lista de empleados gestionada por esta clase. */
    public Empleado[] lista;

    public Empleados(int size) {
        this.lista = new Empleado[size];
    }

    /**
     * Añade un empleado en la posición indicada.
     * @param index índice donde añadir
     * @param empleado empleado a añadir
     */
    public void altaEmpleado(int index, Empleado empleado) {
        if (index < 0 || index >= lista.length) throw new IndexOutOfBoundsException("Índice fuera de rango");
        lista[index] = empleado;
    }

    /**
     * Aumenta el salario de todos los empleados en el porcentaje dado.
     * @param porcentaje porcentaje a aplicar (por ejemplo 10 para 10%)
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado e : lista) {
            if (e != null) {
                double nuevo = e.getSalario() * (1 + porcentaje / 100);
                e.setSalario(nuevo);
            }
        }
    }

    /**
     * Muestra por consola el listado de empleados.
     */
    public void mostrarListado() {
        System.out.println(Textos.LISTA_EMPLEADOS);
        for (Empleado e : lista) {
            if (e != null) System.out.println(e);
        }
    }
}

