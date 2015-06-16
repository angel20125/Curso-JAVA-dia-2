
public class Persona {
    private String Nombre;
    private char   Sexo;
    private int    Edad;

    public Persona() {
    }

    public Persona(String Nombre, char Sexo, int Edad) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Edad = Edad;
       
    }
    
    public String getNombre() {
        return Nombre;
    } 
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public char getSexo() {
        return Sexo;
    }
    
    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    } 
    
    public int getEdad() {
        return Edad;
    } 
    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Nombre  :"+Nombre+"\nEdad  :"+Edad+"\nSexo  :"+Sexo+"\n";
    }
    
    
}
