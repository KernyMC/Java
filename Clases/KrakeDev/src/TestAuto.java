public class TestAuto {

    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Ford", 2017, 100000);
        Auto auto2 = new Auto("Fiat", 2016, 90000);
        System.out.println("Marca: " + auto1.getMarca() + " Modelo: " + auto1.getAnio() + " Precio: " + auto1.getPrecio());
        System.out.println("Marca: " + auto2.getMarca() + " Modelo: " + auto2.getAnio() + " Precio: " + auto2.getPrecio());
    }
    
}
