
public class Profesor extends Persona {

    private String profesion;
    private int añosExperiencia;

    public Profesor(String profesion, int añosExperiencia, String Nombre, char Sexo, int Edad) {
        super(Nombre, Sexo, Edad);
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public Profesor(String profesion, int añosExperiencia) {
        super();
        this.profesion = profesion;
        this.añosExperiencia = añosExperiencia;
    }

    public Profesor() {
        super();
    }

    public Profesor(String Nombre, char Sexo, int Edad) {
        super(Nombre, Sexo, Edad);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Profesion  :" +profesion + "\nAños Experiencia  :" +añosExperiencia+"\n";
    }
}
