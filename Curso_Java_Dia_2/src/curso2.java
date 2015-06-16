
public class curso2 {


    public static void main(String[] args) {
        Persona per1= new Persona("Angel",'M',27);
        
        Estudiante e = new Estudiante("18078863","Ingieria Informatica", 
                                    per1.getNombre(),per1.getSexo(), per1.getEdad());
        Profesor p = new Profesor("Ingeniero en Sistma",27,
                                    per1.getNombre(),per1.getSexo(),per1.getEdad());
    }
    
}
