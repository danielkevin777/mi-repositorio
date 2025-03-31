package practica1;
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    // Constructor
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    // Método para mostrar la información del producto
    public void mostrarInfo() {
        System.out.println("Información del Producto:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Cantidad disponible: " + this.cantidad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    // Método principal para probar la clase Producto
    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 1500.00, 10);
        producto1.mostrarInfo();
    }
}

