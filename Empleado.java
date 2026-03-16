/**
 * Representa un empleado de la empresa.
 * Contiene nombre, cargo y salario con validaciones básicas.
 */
public class Empleado {

    /** Nombre completo del empleado. Debe contener al menos dos palabras. */
    private String nombre;

    /** Cargo profesional del empleado. Usa la enumeración {@link Cargo}. */
    private Cargo cargo;

    /** Salario del empleado. No puede ser menor que el convenio definido en {@link Textos}. */
    private double salario;

    /**
     * Crea un nuevo empleado validando los parámetros.
     * @param nombre Nombre completo (no nulo, al menos dos palabras)
     * @param cargo Cargo profesional (no nulo)
     * @param salario Salario (>= Textos.SALARIO_MINIMO)
     */
    public Empleado(String nombre, Cargo cargo, double salario) {
        setNombre(nombre);
        setCargo(cargo);
        setSalario(salario);
    }

    /**
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre. Debe ser no nulo y contener al menos dos palabras.
     * @param nombre nombre completo
     */
    public void setNombre(String nombre) {
        if (nombre == null) throw new IllegalArgumentException("El nombre no puede ser nulo");
        String trimmed = nombre.trim();
        if (trimmed.isEmpty() || !trimmed.contains(" ")) {
            throw new IllegalArgumentException("El nombre debe contener al menos nombre y apellido");
        }
        this.nombre = trimmed;
    }

    /**
     * @return cargo del empleado
     */
    public Cargo getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo. No puede ser nulo.
     * @param cargo cargo profesional
     */
    public void setCargo(Cargo cargo) {
        if (cargo == null) throw new IllegalArgumentException("El cargo no puede ser nulo");
        this.cargo = cargo;
    }

    /**
     * @return salario actual
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario. Debe ser >= convenio salarial.
     * @param salario nuevo salario
     */
    public void setSalario(double salario) {
        if (Double.isNaN(salario)) throw new IllegalArgumentException("El salario debe ser un número");
        if (salario < Textos.SALARIO_MINIMO) {
            throw new IllegalArgumentException("El salario no puede ser inferior al convenio: " + Textos.SALARIO_MINIMO);
        }
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
