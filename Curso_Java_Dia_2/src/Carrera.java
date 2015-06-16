
import java.util.ArrayList;
import java.util.List;


public class Carrera {
    private String Nombre;
    private List <Pensum> pensum;

    public Carrera() {
        pensum = new ArrayList<>(); 
    }

    public Carrera(String Nombre, List<Pensum> pensum) {
        this.Nombre = Nombre;
        this.pensum = pensum;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List<Pensum> getPensum() {
        return pensum;
    }

    public void setPensum(List<Pensum> pensum) {
        this.pensum = pensum;
    }
    
}
