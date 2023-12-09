public class TestProducto {
    public static void main(String[] args) {
        Producto productoA = new Producto();
        Producto productoB = new Producto();
        Producto productoC = new Producto();

        productoA.nombre = "Colirio";
        productoA.descripcion = "Gotas para los ojos";
        productoA.precio = 100;
        productoA.stockActual = 10;

        productoB.nombre = "Aspirina";
        productoB.descripcion = "Pastillas para el dolor";
        productoB.precio = 50;
        productoB.stockActual = 20;

        productoC.nombre = "Alcohol en gel";
        productoC.descripcion = "Gel antibacterial";
        productoC.precio = 150;
        productoC.stockActual = 5;
    

    }
}
