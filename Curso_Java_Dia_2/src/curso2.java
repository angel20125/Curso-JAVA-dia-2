
public class curso2 {

    public static void main(String[] args) {
        Universidad univ = new Universidad();
        Carrera carr = new Carrera();
        carr.setNombre("Ingenieria Informatica");
        univ.getCarreras().add(carr);
        
        Profesor Prof = new Profesor("Ingeniero en Sistema",27,"Angel",'m',30);
        Materia materia = new Materia();
        materia.setNombre("Programacion");
        for (int i = 0; i < 10; i++) {
            Seccion seccion = new Seccion();
            seccion.setNumeroSeccion(i+1);
            seccion.setProfesorAsignado(Prof);
            for (int j = 0; j < 10; j++) {
                Estudiante e= new Estudiante();
                
                seccion.getEstudiantes().add(e);
            }
            materia.getSecciones().add(seccion);
        }
        Pensum pensum = new Pensum();
        pensum.getMaterias().add(materia);
       //carr.setPensum(pensum);

    }

}
/*
        Persona per1= new Persona("Angel",'M',27);
        
        Estudiante e = new Estudiante("18078863","Ingieria Informatica", 
                                    per1.getNombre(),per1.getSexo(), per1.getEdad());
        Profesor p = new Profesor("Ingeniero en Sistma",27,
                                    per1.getNombre(),per1.getSexo(),per1.getEdad());
        System.out.println("Persona    :"+ per1+"\n");
        System.out.println("Estudiante :"+ e+"\n");
        System.out.println("Profesor   :"+ p+"\n");
*/
