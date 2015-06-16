
import java.util.ArrayList;
import java.util.List;

public class Pensum {
    
  private List<Materia> materias;
  
    public Pensum() {
        materias = new ArrayList<>();
    }
    
    public Pensum(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
  

}
