public class Producto {
    private String nombre;
    private String descripcion;
    private float precio;
    private int stockActual;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setDescripcion(String nuevaDescripcion) {
        descripcion = nuevaDescripcion;
    }

    public void setPrecio(float nuevoPrecio) {
        precio = nuevoPrecio;
    }

    public void setStockActual(int nuevoStockActual) {
        stockActual = nuevoStockActual;
    }

    public Producto(String nombre, String descripcion, float precio, int stockActual) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockActual = stockActual;
    }
}
