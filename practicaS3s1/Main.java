package practicaS3s1;
public class Main {
    public static void main(String[] args) {
        empleado empleado1 = new empleado("Carlos", 25, 3000.0);
        empleado1.mostrarInfo();
        empleado1.setEdad(19); 
        empleado1.setSalario(500); 
    }
}
