import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    public void crearEmpleadoValido() {
        Empleado e = new Empleado("Juan Pérez", Cargo.DESARROLLADOR, 50000);
        assertEquals("Juan Pérez", e.getNombre());
        assertEquals(Cargo.DESARROLLADOR, e.getCargo());
        assertEquals(50000, e.getSalario());
    }

    @Test
    public void nombreVacioLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("", Cargo.DESARROLLADOR, 40000);
        });
    }

    @Test
    public void nombreSinApellidoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("SoloNombre", Cargo.GERENTE, 50000);
        });
    }

    @Test
    public void cargoNuloLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Luis Pérez", null, 40000);
        });
    }

    @Test
    public void salarioPorDebajoMinimoLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Empleado("Laura Ruiz", Cargo.ADMINISTRATIVO, 1000);
        });
    }
}
