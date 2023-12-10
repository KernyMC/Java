

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo();
        r1.base = 10;
        r1.altura = 5;

        r2.base = 8;
        r2.altura = 3;

        int areaR2 = r2.calcularArea();
        int areaR1 = r1.calcularArea();

        double perimetroR1 = r1.calcularPerimetro();
        double perimetroR2 = r2.calcularPerimetro();
        
        System.out.println("El area es de R1: " + areaR1);
        System.out.println("El area es de R2: " + areaR2);
        System.out.println("El perimetro es de R1: " + perimetroR1);
        System.out.println("El perimetro es de R2: " + perimetroR2);
    }
}
