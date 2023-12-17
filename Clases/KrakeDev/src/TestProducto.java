public class TestProducto {
    public static void main(String[] args) {
        Producto productoA = new Producto();
        Producto productoB = new Producto();
        Producto productoC = new Producto();

        productoA.setNombre("Coca Cola");
        productoA.setDescripcion("Gaseosa de cola");
        productoA.setPrecio(20);

        productoB.setNombre("Pepsi");
        productoB.setDescripcion("Gaseosa de cola");
        productoB.setPrecio(18);

        productoC.setNombre("Sprite");
        productoC.setDescripcion("Gaseosa de lima limon");
        productoC.setPrecio(18);

    }
}
