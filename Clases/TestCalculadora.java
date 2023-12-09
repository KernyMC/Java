
public class TestCalculadora {
    public static void main(String[] args) {
        Calculadora calcu;
        int suma, resta;
        calcu = new Calculadora();
        suma = calcu.sumar(1, 5);
        resta = calcu.restar(3, 6);
        
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
    }
}
