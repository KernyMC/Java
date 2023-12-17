public class TestFecha {

    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setAnio(2017);
        f.setMes(10);
        f.setDia(31);
        System.out.println("Fecha: " + f.getDia() + "/" + f.getMes() + "/" + f.getAnio());
    
    
    }
}