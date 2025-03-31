package tarea1;
public class infosuer {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Daniel Kevina savina cuba", "u12345", "Ing.Sistemas");
        Docente docente = new Docente("Jesamin Melissa ZEVALLOS QUISPE", "c12345", "POO");
        alumno.mostrarInfo();
        docente.mostrarInfo();
    }
}
