public class Auto {

    private String marca;
    private int anio;
    private float precio;

    public String getMarca() {
        return marca;
    }
    public int getAnio() {
        return anio;
    }
    public float getPrecio() {
        return precio;
    }

    public void setMarca(String nuevaMarca) {
        marca = nuevaMarca;
    }

    public void setAnio(int nuevoAnio) {
        anio = nuevoAnio;
    }

    public void setPrecio(float nuevoPrecio) {
        precio = nuevoPrecio;
    }

    public Auto(String marca, int anio, float precio) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
    }

}