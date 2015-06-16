
import java.util.ArrayList;
import java.util.List;

public class Materia {

    private String nombre;
    private List<Seccion> secciones;

    public Materia() {
        secciones = new ArrayList<>();
    }

    public Materia(String nombre, List<Seccion> secciones) {
        this.nombre = nombre;
        this.secciones = secciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(List<Seccion> secciones) {
        this.secciones = secciones;
    }

}
