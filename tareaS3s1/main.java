package tareaS3s1;
public class main {
    public static void main(String[] args){
        persona p =new persona();
        p.setNombre("luis");
        p.setEdad(21);
        p.setDni("1235456");
        p.mostrarDatos();
        estudiante Estudiante = new estudiante();
        Estudiante.setDni(null);
        Estudiante.setEdad(15);
        Estudiante.setNombre(null);
        Estudiante.mostrarDato();
    }
}
