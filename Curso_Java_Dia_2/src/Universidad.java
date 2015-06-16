
import java.util.ArrayList;
import java.util.List;


public class Universidad {
    public static final  String nombre= "UNEG";
    public static final  String ubicacion= "PUERTO ORDAZ, CIUDAD GUAYANA";
    private List <Carrera> carreras;

    public Universidad() {
        carreras = new ArrayList<>();
        //carreras.add(new Carrera());
    }

    public Universidad(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }
    
}
